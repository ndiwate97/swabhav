using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ContactWebAPI.DTOs
{
    public class AddDTO
    {
        public string Title { get; set; }
        public static string ErrorMsg { get; set; }
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public long PhoneNo { get; set; }
    }
}