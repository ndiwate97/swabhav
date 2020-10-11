using System;
using System.Collections.Generic;
using EmployeeMVCAPP.Models;

namespace EmployeeMVCAPP.ViewModel
{
    public class HomeViewModel
    {
        public int employeeCount;
        public List<Employee> employees = new List<Employee>();

        public static string ErrorMsg { get; set; }

        public static string UserMsg { get; set; }
    }
}