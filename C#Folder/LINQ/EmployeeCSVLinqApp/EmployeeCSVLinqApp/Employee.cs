using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace EmployeeCSVLinqApp
{
    class Employee
    {
        public int EmployeeId { get; set; }
        public string EmployeeName { get; set; }
        public string Designation { get; set; }
        public float ManagerId { get; set; }
        public string DateOfJoining { get; set; }
        public double Salary { get; set; }
        public double Commission { get; set; }
        public int Department { get; set; }

        public override string ToString()
        {
            return "Id =" + EmployeeId + ",Name = " + EmployeeName + ", Designation = " + Designation + ", Manager Id = "
                + ManagerId + ", Date Of Joining = " + DateOfJoining + ", Salary = " + Salary + ", Commission = "
                + Commission + ", Department Id = " + Department;
        }
    }
}
