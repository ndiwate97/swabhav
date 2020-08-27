using System;
using ShoppingCartApp.Model;

namespace ShoppingCartApp
{
    class Program
    {
        static void Main(string[] args)
        {

            Customer c1 = new Customer(1001, "Namrata", "Ulhasnagar");

            Product apple = new Product(1, "Apple", 10, 5);
            Product mango = new Product(2, "Mango", 15, 10);
            Product orange = new Product(3, "Orange", 5, 5);

            Order o1 = new Order(101, new DateTime(2020, 08, 25));
            o1.AddItem(new LineItem(201, 12, apple));
            o1.AddItem(new LineItem(202, 6, mango));

            Order o2 = new Order(201, new DateTime(2020, 08, 26));
            o2.AddItem(new LineItem(204, 10, mango));
            o2.AddItem(new LineItem(203, 5, orange));

            c1.AddOrder(o1);
            c1.AddOrder(o2);

            PrintInfo(c1);
        }

        private static void PrintInfo(Customer c)
        {
            Console.WriteLine("Customer details : " + c.Id + ", " + c.Name + ", " + c.Address);
            c.Orders.ForEach(Console.WriteLine);
        }
    }
}
