using ContactStoreConsoleApp.Model;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ContactStoreConsoleApp.Repository
{
    interface IContactRepository
    {
        public List<Contact> GetContacts();
        public List<Contact> SearchContact(string name);
        public void AddContact(Contact c);
        public void EditContact(int choice, int id, string Modification);
        public void DeleteContact(int id);
    }
}
