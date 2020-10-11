using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ContactMVCApp.ViewModels
{
    public class LoginViewModel
    {
        public string Title { get; set; }
        public string UserId { get; set; }
        public string Password { get; set; }
        public static string ErrorMsg { get; set; }
        public static string ReturnUrl { get; set; }
    }
}