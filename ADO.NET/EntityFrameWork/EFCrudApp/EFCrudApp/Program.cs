using System;
using System.Collections.Generic;
using System.Data.Entity.Migrations;
using System.Linq;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Contexts;
using System.Text;
using System.Threading.Tasks;

namespace EFCrudApp
{
    class Program
    {
        public static SwabhavDBContext db = new SwabhavDBContext();

        static void Main(string[] args)
        {
            //Case1();

            //Case2();

            //Case3();

            //Case4();

            //CreateEmployee();

            //EmployeeCase1();
            //EmployeeCase2();
            StudentCase3();
            StudentCase4();

        }

        private static void StudentCase4()
        {
            Console.WriteLine("Case4");
            
            var filteredStudent = db.Students
               .Where(s => s.Name.Contains("s"))
               .Where(s => s.CGPA > 6)
               .ToList()
               .Select(s => new
               {
                   FirstName = s.Name.Split(' ')[0],
                   Cgpa = s.CGPA
               });

            foreach (var s in filteredStudent)
            {
                Console.WriteLine("Name = {0}, Cgpa = {1}", s.FirstName, s.Cgpa);
            }
        }

        private static void StudentCase3()
        {
            Console.WriteLine("Case3");

            var filteredStudent = db.Students
                .Where(s => s.Name.Contains("s"))
                .Where(s => s.CGPA > 6)
                .Select(s => new
                {
                    FirstName = s.Name.Split(' ')[0],
                    Cgpa = s.CGPA
                });

            foreach (var s in filteredStudent)
            {
                Console.WriteLine("Name = {0}, Cgpa = {1}", s.FirstName, s.Cgpa);
            }
        }

        private static void EmployeeCase2()
        {
            var emp = db.Employees.ToList().Where(e => e.Salary > 5000).Select(e => new { e.Name, e.Salary });
            Console.WriteLine("\nCase 2 :");
            foreach (var e in emp)
            {
                Console.WriteLine("Name : {0} , Salary : {1}", e.Name, e.Salary);
            }
        }

        private static void EmployeeCase1()
        {
            var emp = db.Employees.Where(e => e.Salary > 5000).Select(e => new { e.Name, e.Salary }).ToList();
            Console.WriteLine("Case 1 :");
            foreach(var e in emp)
            {
                Console.WriteLine("Name : {0} , Salary : {1}",e.Name,e.Salary);
            }
        }

        private static void CreateEmployee()
        {
            Employee[] employees = { new Employee { Id = 101, Name = "Namrata", Salary = 15000 },
            new Employee { Id = 102, Name = "Pawan", Salary = 12000 },
            new Employee { Id = 103, Name = "Tejashree", Salary = 5000 },
            new Employee { Id = 104, Name = "Yash", Salary = 5000 }};

            //Adding Students
            foreach (Employee emp in employees)
                db.Employees.Add(emp);

            db.SaveChanges();
        }

        private static void Case4()
        {
            db.Students.Add(new Student {Id = 104, Name="Yash", CGPA=6.8, Location = "Mumbai" });
            db.SaveChanges();
        }

        private static void Case3()
        {
            Console.WriteLine("\nAfter Delete\n");
            //Deleting student
            foreach (var s in db.Students)
            {
                if (s.Name.Equals("Pawan"))
                    db.Students.Remove(s);
                else
                    Console.WriteLine("Student ID = {0} , Name = {1} , CGPA = {2} ", s.Id, s.Name, s.CGPA);
            }
            db.SaveChanges();
        }

        private static void Case2()
        {
            //displaying students
            foreach (var s in db.Students)
                Console.WriteLine("Student ID = {0} , Name = {1} , CGPA = {2} ", s.Id, s.Name, s.CGPA);

            Console.WriteLine("\nAfter Update\n");
            //Updating student
            foreach (var s in db.Students)
            {
                if (s.Name.Equals("Namrata"))
                {
                    db.Students.AddOrUpdate(new Student { Id = s.Id, Name = "Namrata Diwate", CGPA = s.CGPA });
                }
                Console.WriteLine("Student ID = {0} , Name = {1} , CGPA = {2} ", s.Id, s.Name, s.CGPA);
            }
            db.SaveChanges();

        }

        private static void Case1()
        {
            Student[] students = { new Student { Id = 101, Name = "Namrata", CGPA = 7.0 },
            new Student { Id = 102, Name = "Pawan", CGPA = 7.5 },
            new Student { Id = 103, Name = "Tejashree", CGPA = 7.8 }};

            //Adding Students
            foreach (Student stud in students)
                db.Students.Add(stud);

            db.SaveChanges();

        }
    }
}
