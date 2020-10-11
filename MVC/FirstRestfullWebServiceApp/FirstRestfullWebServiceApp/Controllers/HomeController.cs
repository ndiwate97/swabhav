using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace FirstRestfullWebServiceApp.Controllers
{
    public class HomeController : ApiController
    {
        public IHttpActionResult Get()
        {
            return Ok("Get Called");
        }

        public IHttpActionResult Post()
        {
            return Ok("Post Called");
        }

        public IHttpActionResult Put()
        {
            return Ok("Put Called");
        }

        public IHttpActionResult Delete()
        {
            return Ok("Delete Called");
        }

    }
}
