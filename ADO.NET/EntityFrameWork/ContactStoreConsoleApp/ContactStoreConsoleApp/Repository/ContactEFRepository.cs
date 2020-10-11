using ContactStoreConsoleApp.DBContext;
using ContactStoreConsoleApp.Model;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.Migrations;
using System.Linq;

namespace ContactStoreConsoleApp.Repository
{
    class ContactEFRepository : IContactRepository
    {

        private const int FIRSTNAME = 1;
        private const int LASTNAME = 2;
        private const int PHONENO = 3;

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

        void IContactRepository.EditContact(int choice, int id, string Modification)
        {
            foreach (Contact c in contactDB.Contacts)
            {
                if (c.Id == id)
                {
                    if (choice == FIRSTNAME)
                    {
                        contactDB.Contacts.AddOrUpdate(new Contact { Id = c.Id, FirstName = Modification, LastName = c.LastName, PhoneNo = c.PhoneNo });
                    }
                    if (choice == LASTNAME)
                    {
                        contactDB.Contacts.AddOrUpdate(new Contact { Id = c.Id, FirstName = c.FirstName, LastName = Modification, PhoneNo = c.PhoneNo });
                    }
                    if (choice == PHONENO)
                    {
                        contactDB.Contacts.AddOrUpdate(new Contact { Id = c.Id, FirstName = c.FirstName, LastName = c.LastName, PhoneNo = long.Parse(Modification) });
                    }
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

    }
}

