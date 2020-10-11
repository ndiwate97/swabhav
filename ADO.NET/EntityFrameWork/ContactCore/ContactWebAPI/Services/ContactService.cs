using ContactCore.Repositorys;
using ContactCore.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ContactMVCApp.Services
{
    public class ContactService
    {
        private static ContactService serviceObj = null;
        private IContactRepository contactRepository;


        public static ContactService getInstance(IContactRepository repository)
        {
            if (serviceObj == null)
            {
                serviceObj = new ContactService(repository);
            }
            return serviceObj;
        }

        public ContactService(IContactRepository repository)
        {
            this.contactRepository = repository;
        }


        public List<Contact> GetContacts()
        {
            return contactRepository.GetContacts();
        }

        public List<Contact> SearchContact(string name)
        {
            return contactRepository.SearchContact(name);
        }

        public void AddContact(Contact c)
        {
            contactRepository.AddContact(c);
        }

        public void EditContact(Contact c)
        {
            contactRepository.EditContact(c);
        }

        public void DeleteContact(int id)
        {
            contactRepository.DeleteContact(id);
        }

        public Contact GetContactById(int id)
        {
            return contactRepository.GetContactById(id);
        }

        public bool IsValidId(int id)
        {
            foreach(var c in contactRepository.GetContacts())
            {
                if (c.Id == id)
                    return true;
            }
            return false;
        }
    }
}