using StateManagementApp.ViewModels;
using System;
using System.Web;
using System.Web.Mvc;

namespace StateManagementApp.Controllers
{
    public class CookieController : Controller
    {
        public ActionResult Add()
        {
            CookieViewModel cvm = new CookieViewModel { SuccessMessage = "Cookie Created Sucessfully" };
            HttpCookie cookie = new HttpCookie("Color", "Red");
            cookie.Expires = DateTime.Now.AddDays(7);
            Response.Cookies.Add(cookie);
            return View(cvm);
        }

        public ActionResult Display()
        {
            CookieViewModel cvm = new CookieViewModel();
            HttpCookie cookie = HttpContext.Request.Cookies.Get("Color");

            if (cookie != null)
            {
                cvm.CookieName = cookie.Name;
                cvm.CookieValue = cookie.Value;
                cvm.CookieExpires = cookie.Expires;
            }
            else
            {
                cvm.ErrorMessage = "Cookie Not Found";
            }

            return View(cvm);
        }
    }
}