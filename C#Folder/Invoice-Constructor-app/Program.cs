using System;

namespace Invoice_Constructor_app
{
    class Program
    {
        static void Main(string[] args)
        {
            Invoice i = new Invoice(101, "object1", 100, 20);
            printInformation(i);
            Invoice i1 = new Invoice();
            printInformation(i1);
        }

        private static void printInformation(Invoice i)
        {
            Console.WriteLine("\nID : " + i.getID());
            Console.WriteLine("Name : " + i.getName());
            Console.WriteLine("Amount of Product : " + i.getAmount());
            Console.WriteLine("Discount on Product : " + i.getDiscountPrecentage() + "%");

            Console.WriteLine("Amount to be paid : " + i.calculateTotalCost(i.calculateGST()));

        }
    }
}
