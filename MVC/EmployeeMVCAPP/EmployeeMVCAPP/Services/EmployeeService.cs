using EmployeeMVCAPP.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace EmployeeMVCAPP.Services
{
    public class EmployeeService
    {
        public static List<Employee> employees = new List<Employee>
        {
            new Employee
            {
                Id= 101,
                Name = "Namrata",
                Salary = 15000
            },
            new Employee
            {
                Id= 102,
                Name = "Pawan",
                Salary = 15000
            },
            new Employee
            {
                Id= 103,
                Name = "Tejashree",
                Salary = 15000
            }
        };

        private static EmployeeService serviceObj = null ;

        public EmployeeService()
        {
            Console.WriteLine("EmployeeService Object Created");
        }

        public static EmployeeService getInstance()
        {
            if (serviceObj == null)
            {
                serviceObj = new EmployeeService();
            }
            return serviceObj;
        }


        public List<Employee> GetEmployees()
        {
            return employees;
        }

        public Employee GetEmployeeById(int id)
        {
            Employee employee = employees.Single(e => e.Id== id);

            return employee;
        }


        public void AddEmp(Employee empModel)
        {
            employees.Add(empModel);
        }


        public void UpdateEmp(Employee empModel)
        {
            employees.Where(e => e.Id == empModel.Id)
                .Select(e =>
                {
                    e.Name = empModel.Name;
                    e.Salary = empModel.Salary;
                    return e;
                }).ToList();
        }

        public bool IsValidId(int id)
        {
            foreach(Employee e in employees)
            {
                if (e.Id == id)
                {
                    return true;
                }
            }            
                return false;
        }

        internal void DeleteEmp(int id)
        {
            employees.RemoveAll(e => e.Id == id);
        }
    }
}