using EmployeeMVCAPP.Models;
using EmployeeMVCAPP.Services;
using EmployeeMVCAPP.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Web;
using System.Web.Mvc;

namespace EmployeeMVCAPP.Controllers
{
    public class EmployeeController : Controller
    {
        // Employee
        public ActionResult Index()
        {
            return View();
        }

        // Employee/Home
        public ActionResult Home()
        {
            HomeViewModel vm = new HomeViewModel();
            EmployeeService service = EmployeeService.getInstance();
            vm.employees = service.GetEmployees();
            vm.employeeCount = service.GetEmployees().Count();
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
                var vm = new AddViewModel { Title = "Add new Employee" };

                return View(vm);
            }


        }

        [HttpPost]
        public ActionResult AddEmployee(AddViewModel vm)
        {
            if (vm.Id == 0)
            {
                AddViewModel.ErrorMsg = "Id cannot be 0 ...";
                return RedirectToAction("Add");
            }
            Employee empModel = new Employee { Id = vm.Id, Name = vm.Name, Salary = vm.Salary };
            EmployeeService service = EmployeeService.getInstance();
            service.AddEmp(empModel);
            return RedirectToAction("Home");

        }

        [HttpGet]
        public ActionResult Edit(int id)
        {
            if (Session["User"] == null)
            {
                return RedirectToAction("Login", new { returnUrl = "Edit/"+id });
            }
            EditViewModel vm = new EditViewModel();
            EmployeeService service = EmployeeService.getInstance();
            Employee e = service.GetEmployeeById(id);
            vm.Title = "Edit User";
            vm.Id = e.Id;
            vm.Name = e.Name;
            vm.Salary = e.Salary;
            return View(vm);
        }

        [HttpPost]
        public ActionResult Edit(EditViewModel vm)
        {
            Employee empModel = new Employee { Id = vm.Id, Name = vm.Name, Salary = vm.Salary };
            EmployeeService service = EmployeeService.getInstance();
            service.UpdateEmp(empModel);
            return RedirectToAction("Home");
        }


        public ActionResult Delete(int id)
        {
            if (Session["User"] == null)
            {
                return RedirectToAction("Login", new { returnUrl = "Delete/"+id });
            }

            EmployeeService service = EmployeeService.getInstance();

            if (service.IsValidId(id))
            {
                HomeViewModel.ErrorMsg = null;
                service.DeleteEmp(id);
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
            LoginViewModel lvm = new LoginViewModel { Title = "Login....."  };
            LoginViewModel.ReturnUrl = returnUrl;
            return View(lvm);
        }

        [HttpPost]
        public ActionResult Login( LoginViewModel lvm)
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
