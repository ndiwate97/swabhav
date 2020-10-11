using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Web;
using System.Web.Mvc;

namespace WelcomeApp.Controllers
{
    public class WelcomeController : Controller
    {
        public string getMessage()
        {
            return "<h1>Welcome to MVC Application</h1>" + greet();
        }

        private string greet()
        {
            if (DateTime.Now.Hour < 12)
            {
                return "<br><br>" + Convert.ToString(DateTime.Now) + "<br>This is Morning";
            }
            else if (DateTime.Now.Hour < 17)
            {
                return "<br><br>" + Convert.ToString(DateTime.Now) + "<br>This is Afternoon";
            }
            else
            {
                return "<br><br>" + Convert.ToString(DateTime.Now) + "<br>This is Evening";
            }
        }

        public ActionResult getDepartment(int id = 0)
        {
            return Content("<h1>Displaying Employees in Department id : " + id + "<h1>");
        }

        public ActionResult getData()
        {
            var student = new[] { new { id = 10, name = "Namrata" }, new { id = 20, name = "Tejashree" }, new { id = 30, name = "Pawan" } };

            return Json(student, JsonRequestBehavior.AllowGet);
        }

        public ActionResult Index()
        {
            return View();
        }

        public ActionResult ShowUser(string name)
        {
            ViewBag.name = name;
            return View();
        }
    }
}