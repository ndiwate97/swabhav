using ContactMVCApp.DBContext;
using ContactMVCApp.Models;
using ContactMVCApp.Repository;
using ContactMVCApp.Services;
using ContactMVCApp.ViewModels;
using System.Web.Mvc;

namespace ContactMVCApp.Controllers
{
    public class ContactController : Controller
    {
        [HttpGet]
        public ActionResult Home()
        {
            HomeViewModel vm = new HomeViewModel();
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            HomeViewModel.Header = "My Contacts";
            vm.contacts = service.GetContacts();

            return View(vm);
        }

        [HttpGet]
        public ActionResult Add()
        {
            if (Session["User"] == null)
            {
                return RedirectToAction("Login", new { returnUrl = "Add" });
            }
            else
            {
                var vm = new AddViewModel { Title = "Add new Contact" };
                return View(vm);
            }
        }

        [HttpPost]
        public ActionResult Add(AddViewModel vm)
        {            
            Contact ContactModel = new Contact { FirstName = vm.FirstName, LastName = vm.LastName, PhoneNo= vm.PhoneNo };
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            service.AddContact(ContactModel);
            return RedirectToAction("Home");
        }

        [HttpGet]
        public ActionResult Edit(int id)
        {
            if (Session["User"] == null)
            {
                return RedirectToAction("Login", new { returnUrl = "Edit/" + id });
            }
            EditViewModel vm = new EditViewModel();
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            Contact c = service.GetContactById(id);
            vm.Title = "Edit Contact";
            vm.Id = c.Id;
            vm.FirstName = c.FirstName;
            vm.LastName = c.LastName;
            vm.PhoneNo = c.PhoneNo;
            return View(vm);
        }

        [HttpPost]
        public ActionResult Edit(EditViewModel vm)
        {
            Contact ContactModel = new Contact {Id = vm.Id, FirstName = vm.FirstName, LastName = vm.LastName, PhoneNo = vm.PhoneNo };
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            service.EditContact(ContactModel);
            return RedirectToAction("Home");
        }

        public ActionResult Delete(int id)
        {
            if (Session["User"] == null)
            {
                return RedirectToAction("Login", new { returnUrl = "Delete/" + id });
            }
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));

            if (service.IsValidId(id))
            {
                HomeViewModel.ErrorMsg = null;
                service.DeleteContact(id);
            }
            else
            {
                HomeViewModel.ErrorMsg = "Id Not Found to Delete";
            }

            return RedirectToAction("Home");
        }

        [HttpGet]
        public ActionResult Login(string returnUrl)
        {
            LoginViewModel lvm = new LoginViewModel { Title = "Login....." };
            LoginViewModel.ReturnUrl = returnUrl;
            return View(lvm);
        }

        [HttpPost]
        public ActionResult Login(LoginViewModel lvm)
        {
            if (Session["User"] == null)
            {
                User u = new User { UserId = lvm.UserId, Password = lvm.Password };

                if (AuthService.IsValidUser(u))
                {
                    LoginViewModel.ErrorMsg = "";
                    Session["User"] = lvm;
                    //return RedirectToAction("Home");
                    return RedirectToAction(LoginViewModel.ReturnUrl);
                }
                else
                {
                    LoginViewModel.ErrorMsg = " Invalid User";
                    return RedirectToAction("Login");
                }
            }
            else
            {
                HomeViewModel.ErrorMsg = "User already Logged in.....";
                return RedirectToAction("Home");
            }

        }

        public ActionResult Logout()
        {
            Session["User"] = null;
            return RedirectToAction("Home");
        }
    }
}