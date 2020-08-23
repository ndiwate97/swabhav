using CollegeApp.Model;
using System;

namespace CollegeApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Model.Student s = new Model.Student(1, "Ulhasnagar", new DateTime(1997,09,30) , Model.Branch.COMP);
            PrintBasicInfo(s);

            Model.Professor p = new Model.Professor(101, "Andheri",new DateTime(1993,04,15), 15000);
            PrintBasicInfo(p);
        }

        private static void PrintBasicInfo(Model.Person person)
        {
            Console.WriteLine("\nId : " + person.Id);
            Console.WriteLine("Address : " + person.Address);
            Console.WriteLine("Date Of Birth : " + person.DateOfBirth);

            if (person is Student)
            {
                Student s = (Student)person;
                Console.WriteLine("Branch : " + s.Branch);
            }
            else if (person is Professor)
            {
                Professor pr = (Professor)person;
                Console.WriteLine("Basic Pay : " + pr.BasicSalary);
                Console.WriteLine("Total Salary : " + pr.GrossSalary);
            }
            else
            {
                Console.WriteLine("No more information found...!");
            }
        }
    }
}
