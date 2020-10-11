using System.Data.Entity;

namespace EFCrudApp
{
    class SwabhavDBContext : DbContext
    {
        public DbSet<Student> Students { get; set; }
        public DbSet<Employee> Employees { get; set; }

        public SwabhavDBContext() : base("SwabhavDBContext")
        {

        }
    }
}
