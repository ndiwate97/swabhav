using StateManagementApp.ViewModels;
using System.Web.Mvc;

namespace StateManagementApp.Controllers
{
    public class ApplicationController : Controller
    {
        public ActionResult Home()
        {
            StateViewModel svm;

            if (HttpContext.Application["CurrentSession"] != null)
            {
                svm = (StateViewModel)HttpContext.Application["CurrentSession"];
            }
            else
            {
                svm = new StateViewModel();
            }

            svm.OldValue = svm.Counter;
            svm.Counter++;
            svm.NewValue = svm.Counter;

            HttpContext.Application["CurrentSession"] = svm;
            return View(svm);
        }
    }
}