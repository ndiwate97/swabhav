using ContactCore.DBContext;
using ContactCore.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity.Migrations;
using System.Linq;

namespace ContactCore.Repositorys
{
    public class ContactEFRepository : IContactRepository
    {
        public ContactDbContext contactDB;

        public ContactEFRepository(ContactDbContext contactDB)
        {
            this.contactDB = contactDB;
        }
               
        public List<Contact> GetContacts()
        {
            return contactDB.Contacts.ToList();
        }

        public List<Contact> SearchContact(string name)
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


        public void AddContact(Contact c)
        {
            contactDB.Contacts.Add(c);
            contactDB.SaveChanges();
        }

        public void EditContact(Contact c)
        {
            foreach (Contact contact in contactDB.Contacts)
            {
                if (contact.Id == c.Id)
                {
                    contactDB.Contacts.AddOrUpdate(
                        new Contact
                        { Id = c.Id, FirstName = c.FirstName, LastName = c.LastName, PhoneNo = c.PhoneNo });
                }
                contactDB.SaveChanges();
            }
        }

        public void DeleteContact(int id)
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
