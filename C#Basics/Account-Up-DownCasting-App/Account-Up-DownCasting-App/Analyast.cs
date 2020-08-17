using System;
using System.Collections.Generic;
using System.Text;

namespace Account_Up_DownCasting_App
{
    class Analyast : Employee
    {
		private const float PERKS = 20;

		public Analyast(int empId, String empName) : base(empId, empName) { }
		

		public float getPERKS()
		{
			return PERKS;
		}

		
		public override void calculateSalary()
		{
			grossSalary = BASICPAY + (BASICPAY * (PERKS / 100));
		}

    }
}
