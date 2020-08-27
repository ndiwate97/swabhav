using System;
using System.Collections.Generic;
using EmpEventApp.Publisher;

namespace EmpEventApp
{
    class Program
    {
        static void Main(string[] args)
        {
            DataService d = new DataService();
            d.RequestComplete += PrintEmployees;
            d.ProcessData();
        }

        private static void PrintEmployees(List<Employee> emp)
        {
            Console.WriteLine("Data Processing Completed");
            foreach(Employee e in emp)
            {
                Console.WriteLine(e);
            }
        }
    }
}
