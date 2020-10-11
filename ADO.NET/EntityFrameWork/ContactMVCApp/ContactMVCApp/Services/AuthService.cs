using ContactMVCApp.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ContactMVCApp.Services
{
    public class AuthService
    {
        public static List<User> Users = new List<User>
        {
            new User
            {
                UserId= "Admin",
                Password = "Admin"
            },
            new User
            {
                UserId= "Namrata",
                Password = "Namrata@97"
            }
        };

        public static bool IsValidUser(User InputUser)
        {
            foreach (User u in Users)
            {
                if (u.UserId.Equals(InputUser.UserId) && u.Password.Equals(InputUser.Password))
                {
                    return true;
                }
            }
            return false;
        }
    }
}