using StateManagementApp.ViewModels;
using System.Web.Mvc;

namespace StateManagementApp.Controllers
{
    public class SessionController : Controller
    {
        public ActionResult Home()
        {
            StateViewModel svm;

            if (Session["CurrentSession"] != null)
            {
                svm = (StateViewModel)Session["CurrentSession"];
            }
            else
            {
                svm = new StateViewModel();
            }

            svm.OldValue = svm.Counter;
            svm.Counter++;
            svm.NewValue = svm.Counter;

            Session["CurrentSession"] = svm;
            return View(svm);
        }

    }
}