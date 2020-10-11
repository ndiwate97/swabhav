using FirstRestfullWebServiceApp.DTOs;
using FirstRestfullWebServiceApp.Models;
using FirstRestfullWebServiceApp.Services;
using System.Collections.Generic;
using System.Web.Http;

namespace FirstRestfullWebServiceApp.Controllers
{
    [RoutePrefix("api/v1/Employee")]
    public class EmployeeController : ApiController
    {
        [Route("")]
        public IEnumerable<Employee> Get()
        {
            EmployeeService service = EmployeeService.getInstance();
            return service.GetEmployees();
        }

        [Route("{id:int}")]
        public Employee Get(int id)
        {
            EmployeeService service = EmployeeService.getInstance();
            return service.GetEmployeeById(id);
        }

        [Route("")]
        public IHttpActionResult Post(EmployeeDTO employeeDTO)
        {
            if (employeeDTO.Id == 0)
                return BadRequest("Invalid data.");

            Employee empModel = new Employee 
            { 
                Id = employeeDTO.Id , 
                Name = employeeDTO.FirstName + " " +employeeDTO.LastName,
                Salary = employeeDTO.CTC/12
            };

            EmployeeService service = EmployeeService.getInstance();
            service.AddEmp(empModel);
            return Ok("Employee Added Successfully");
        }
    }
}
