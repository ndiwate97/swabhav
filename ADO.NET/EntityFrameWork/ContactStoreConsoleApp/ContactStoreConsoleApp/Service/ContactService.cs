using ContactStoreConsoleApp.DBContext;
using ContactStoreConsoleApp.Model;
using ContactStoreConsoleApp.Repository;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.Migrations;

namespace ContactStoreConsoleApp.Service
{
    class ContactService
    {
        private const int FIRSTNAME = 1;
        private const int LASTNAME = 2;
        private const int PHONENO = 3;

        private static ContactService serviceObj = null;
        private IContactRepository contactRepository;

        public ContactService(IContactRepository repository)
        {
            this.contactRepository = repository;
        }

        //public static ContactService getInstance(ContactEFRepository contactEFRepository)
        //{
        //    if (serviceObj == null)
        //    {
        //        serviceObj = new ContactService(contactEFRepository);
        //    }
        //    return serviceObj;
        //}

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

        public void EditContact(int choice, int id, string Modification)
        {
            contactRepository.EditContact(choice, id, Modification);
        }

        public void DeleteContact(int id)
        {
            contactRepository.DeleteContact(id);
        }
    }
}
