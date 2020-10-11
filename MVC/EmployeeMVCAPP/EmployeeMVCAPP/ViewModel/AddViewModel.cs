using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace EmployeeMVCAPP.ViewModel
{
    public class AddViewModel
    {
        public string Title { get; set; }
        public static string ErrorMsg { get; set; }
        public int Id { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }
        
    }
}