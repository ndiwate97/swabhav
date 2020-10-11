using ContactCore.DBContext;
using ContactCore.Models;
using ContactCore.Repositorys;
using ContactMVCApp.Services;
using System.Collections.Generic;
using System.Web.Http;
using System.Web.Http.Cors;

namespace ContactWebAPI.Controllers
{
    [EnableCors(origins: "*", headers: "*", methods: "*", SupportsCredentials = true)]
    [System.Web.Http.RoutePrefix("api/v1/Contact")]
    public class ContactController : ApiController
    {
        [System.Web.Http.Route("")]
        public List<Contact> GetContacts()
        {
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            return service.GetContacts();
        }

        [System.Web.Http.Route("{id:int}")]
        public Contact GetContactsByID(int id)
        {
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            return service.GetContactById(id);
        }

        [System.Web.Http.Route("AddContact")]
        public IHttpActionResult AddContact(DTOs.AddDTO add)
        {
            Contact ContactModel = new Contact { FirstName = add.FirstName, LastName = add.LastName, PhoneNo = add.PhoneNo };
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            service.AddContact(ContactModel);

            return Ok("Contact Added Successfully");
        }

        [System.Web.Http.Route("EditContact")]
        public IHttpActionResult EditContact(DTOs.EditDTO edit)
        {
            Contact ContactModel = new Contact {Id =edit.Id, FirstName = edit.FirstName, LastName = edit.LastName, PhoneNo = edit.PhoneNo };
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));
            service.EditContact(ContactModel);

            return Ok("Contact Edited Successfully");
        }

        [System.Web.Http.Route("Delete")]
        public IHttpActionResult Delete(int id)
        {
            ContactService service = ContactService.getInstance(new ContactEFRepository(new ContactDbContext()));

            if (service.IsValidId(id))
            {
                service.DeleteContact(id);
                return Ok("Contact Deleted Successfully");
            }
            else
            {
                return Ok("Id Not Found to Delete");
            }
        }
    }
}