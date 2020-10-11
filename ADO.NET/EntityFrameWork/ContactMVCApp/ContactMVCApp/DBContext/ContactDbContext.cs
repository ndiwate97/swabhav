using ContactMVCApp.Models;
using System.Data.Entity;

namespace ContactMVCApp.DBContext
{
    public class ContactDbContext : DbContext
    {
        public DbSet<Contact> Contacts { get; set; }

        public ContactDbContext() : base("ContactDBContext")
        {

        }
    }
}