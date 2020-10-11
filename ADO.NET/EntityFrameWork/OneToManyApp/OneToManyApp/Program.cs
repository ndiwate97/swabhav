using OneToManyApp.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace OneToManyApp
{
    class Program
    {
        public static SwabhavDBContext db = new SwabhavDBContext();

        static void Main(string[] args)
        {
            var c1 = new Customer {CustId =101, Name = "Namrata", Location ="Mumbai" };

            var order1 = new Order { OrderId = 201, ProdName = "Books", UnitPrice = 1000, Quantity = 2 };
            var order2 = new Order { OrderId = 202, ProdName = "Pens", UnitPrice = 100, Quantity = 5 };

            order1.Customer = c1;
            order2.Customer = c1;

            c1.CustomerOrders.Add(order1);
            c1.CustomerOrders.Add(order2);

            db.SaveChanges();

        }
    }
}
