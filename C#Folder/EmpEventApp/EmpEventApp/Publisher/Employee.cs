using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmpEventApp.Publisher
{
    public class Employee
    {
        private int _employeeId;
        private string _employeeName;
        private string _designation;
        private int _managerId;
        private string _dateOfJoining;
        private double _salary;
        private double _commission;
        private int _department;

        public Employee(int employeeId, string employeeName, string designation, int managerId,
            string dateOfJoining, double salary, double commission, int department)
        {
            this._employeeId = employeeId;
            this._employeeName = employeeName;
            this._designation = designation;
            this._managerId = managerId;
            this._dateOfJoining = dateOfJoining;
            this._salary = salary;
            this._commission = commission;
            this._department = department;
        }

        public override string ToString()
        {
            return "\nId =" + _employeeId + ",Name = " + _employeeName + ", Designation = " + _designation + ", Manager Id = "
                + _managerId + ", Date Of Joining = " + _dateOfJoining + ", Salary = " + _salary + ", Commission = "
                + _commission + ", Department Id = " + _department;
        }        
    }
}
