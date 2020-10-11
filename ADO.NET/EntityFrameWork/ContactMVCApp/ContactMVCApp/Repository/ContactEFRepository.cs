using ContactMVCApp.DBContext;
using ContactMVCApp.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity.Migrations;
using System.Linq;
using System.Web;

namespace ContactMVCApp.Repository
{
    public class ContactEFRepository : IContactRepository
    {
        public ContactDbContext contactDB;

        public ContactEFRepository(ContactDbContext contactDB)
        {
            this.contactDB = contactDB;
        }

        List<Contact> IContactRepository.GetContacts()
        {
            return contactDB.Contacts.ToList();
        }

        List<Contact> IContactRepository.SearchContact(string name)
        {
            List<Contact> contacts = new List<Contact>();

            foreach (Contact c in contactDB.Contacts)
            {
                if (c.FirstName.ToLower().Equals(name.ToLower()) || c.LastName.ToLower().Equals(name.ToLower()))
                {
                    contacts.Add(c);
                }
            }

            return contacts;
        }

        void IContactRepository.AddContact(Contact c)
        {

            contactDB.Contacts.Add(c);

            contactDB.SaveChanges();
        }

        void IContactRepository.EditContact(Contact cont)
        {
            foreach (Contact c in contactDB.Contacts)
            {
                if (c.Id == cont.Id)
                {                    
                        contactDB.Contacts.AddOrUpdate(
                            new Contact 
                            { Id = cont.Id, FirstName = cont.FirstName, LastName = cont.LastName, PhoneNo = cont.PhoneNo });                   
                }
                contactDB.SaveChanges();
            }
        }

        void IContactRepository.DeleteContact(int id)
        {
            try
            {
                foreach (Contact c in contactDB.Contacts)
                {
                    if (c.Id == id)
                    {
                        contactDB.Contacts.Remove(c);
                        contactDB.SaveChanges();
                    }
                }
            }
            catch (Exception ex)
            {
                throw new Exception("Record does not exist in the database");
            }
        }

        public Contact GetContactById(int id)
        {
            foreach (Contact c in contactDB.Contacts)
            {
                if (c.Id == id)
                {
                    return c;
                }
            }
            return null;
        }
    }
}