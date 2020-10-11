
using OneToManyApp.Model;
using System.Data.Entity;

namespace OneToManyApp
{
    class SwabhavDBContext : DbContext
    {
        public DbSet<Customer> Customers { get; set; }
        public DbSet<Order> Orders { get; set; }

        public SwabhavDBContext() : base("SwabhavDBContext")
        {

        }
    }
}
