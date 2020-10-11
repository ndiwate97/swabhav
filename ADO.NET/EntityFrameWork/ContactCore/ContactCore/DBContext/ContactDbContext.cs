using ContactCore.Models;
using System.Data.Entity;

namespace ContactCore.DBContext
{
    public class ContactDbContext : DbContext
    {
        public DbSet<Contact> Contacts { get; set; }

        public ContactDbContext() : base("ContactDBContext")
        {

        }
    }
}
