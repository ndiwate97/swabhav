using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace EmployeeCSVLinqApp
{
    class Program
    {
        public static IEnumerable<Employee> Employees;
        public static IEnumerable<Department> Departments;

        static void Main(string[] args)
        {
            Employees = LoadEmployees();
            Console.WriteLine("Employee Details : ");
            //foreach (Employee e in Employees)
            //{
            //    Console.WriteLine(e);
            //}

            Departments = LoadDepartments();
            Console.WriteLine("\nDepartment Details : ");
            //foreach (Department d in Departments)
            //{
            //    Console.WriteLine(d);
            //}

            ExecuteQueries();
        }

        private static IEnumerable<Department> LoadDepartments()
        {
            return File.ReadAllLines(@"C:\swabhav\C#Folder\LINQ\EmployeeCSVLinqApp\EmployeeCSVLinqApp\File\Dept.csv")
                         .Select(x => x.Split(','))
                         .Skip(1)
                         .Select(x =>
                              new Department
                              {
                                  DepartmentNo = int.Parse(x[0]),
                                  DepartmentName = x[1],
                                  Location = x[2]
                              });
        }

        private static IEnumerable<Employee> LoadEmployees()
        {
            return File.ReadAllLines(@"C:\swabhav\C#Folder\LINQ\EmployeeCSVLinqApp\EmployeeCSVLinqApp\File\emp.csv")
                          .Select(x => x.Split(','))
                          .Skip(1)
                          .Select(x =>
                               new Employee
                               {
                                   EmployeeId = int.Parse(x[0]),
                                   EmployeeName = x[1],
                                   Designation = x[2],
                                   ManagerId = float.Parse(CheckNull(x[3])),
                                   DateOfJoining = x[4],
                                   Salary = double.Parse(x[5]),
                                   Commission = double.Parse(CheckNull(x[6])),
                                   Department = int.Parse(x[7])
                               });
        }

        private static String CheckNull(String data)
        {
            if (data.Equals("NULL") || data.Equals(""))
            {
                return "0";
            }
            return data;
        }

        private static void ExecuteQueries()
        {
            Console.WriteLine("\nAll employees whose commision is null : \n");
            var query1 = Employees.Where(employee => employee.Commission == 0);
            foreach (Employee e in query1)
            {
                Console.WriteLine(e);
            }

            Console.WriteLine("\nAll employees whose salary between 2000 and 5000 : \n");
            var query2 = Employees.Where(employee => employee.Salary >= 2000 && employee.Salary <= 5000);
            foreach (Employee e in query2)
            {
                Console.WriteLine(e);
            }

            Console.WriteLine("\nAll employees annual salary : \n");
            var query3 = Employees.Select(employee => new
            {
                EmpId = employee.EmployeeId,
                EmpName = employee.EmployeeName,
                AnnualSalary = employee.Salary * 12
            });
            foreach (var e in query3)
            {
                Console.WriteLine("Id =" + e.EmpId + " , Name = " + e.EmpName + " , Annual Salary = "+e.AnnualSalary);
            }

            Console.WriteLine("\nTHE TOP 3 SALARY EARNING EMPLOYEES : \n");
            var query4 = Employees.Select(employee => new
            {
                EmpId = employee.EmployeeId,
                EmpName = employee.EmployeeName,
                Salary = employee.Salary
            }).OrderByDescending(e => e.Salary).Take(3);
            foreach (var e in query4)
            {
                Console.WriteLine("Id =" + e.EmpId + " , Name = " + e.EmpName + " , Annual Salary = " + e.Salary);
            }
        }
    }
}
