using ContactStoreConsoleApp.Model;
using System.Data.Entity;


namespace ContactStoreConsoleApp.DBContext
{
    class ContactDbContext : DbContext
    {
        public DbSet<Contact> Contacts { get; set; }

        public ContactDbContext() : base("ContactDBContext")
        {
            
        }
    }
}
