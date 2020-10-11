using ContactMVCApp.Models;
using System.Collections.Generic;

namespace ContactMVCApp.Repository
{
    public interface IContactRepository
    {
        List<Contact> GetContacts();
        List<Contact> SearchContact(string name);
        void AddContact(Contact c);
        void EditContact(Contact c);
        void DeleteContact(int id);
        Contact GetContactById(int id);
    }
}