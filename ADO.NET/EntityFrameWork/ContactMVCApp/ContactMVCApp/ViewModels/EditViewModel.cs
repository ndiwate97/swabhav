using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ContactMVCApp.ViewModels
{
    public class EditViewModel
    {
        public string Title { get; set; }
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public long PhoneNo { get; set; }
    }
}