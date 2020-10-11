using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace OneToManyApp.Model
{
    [Table("Customer")]
    public class Customer
    {
        [Key]
        public int CustId { get; set; }
        public string Name { get; set; }
        public double PhoneNumber { get; set; }
        public string Location { get; set; }
        public List<Order> CustomerOrders { get; set; }

        public Customer()
        {
            CustomerOrders = new List<Order>();
        }

       
    }
}
