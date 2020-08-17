using System;
using System.Collections.Generic;
using System.Text;

namespace Account_Up_DownCasting_App
{
    class Developer : Employee
    {
		private const float BONUSPERCENT = 30;

		public Developer(int empId, String empName):base(empId, empName) { }


		public float getBONUSPERCENT()
		{
			return BONUSPERCENT;
		}


		
		public override void calculateSalary()
		{
			grossSalary = BASICPAY + (BASICPAY * (BONUSPERCENT / 100));
		}
	}
}
