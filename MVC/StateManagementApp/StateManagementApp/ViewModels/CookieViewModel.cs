using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StateManagementApp.ViewModels
{
    public class CookieViewModel
    {
        public string SuccessMessage { get; set; }
        public string ErrorMessage { get; set; }
        public string CookieValue { get; set; }
        public string CookieName { get; set; }
        public DateTime CookieExpires { get; set; }
    }
}