using ContactMVCApp.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ContactMVCApp.ViewModels
{
    public class HomeViewModel
    {
        public static string Header { get; set; }
        public List<Contact> contacts = new List<Contact>();

        public static string ErrorMsg { get; set; }

        public static string UserMsg { get; set; }
    }
}