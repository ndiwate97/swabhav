using System;

namespace Account_Up_DownCasting_App
{
    class Program
    {
        static void Main(string[] args)
        {
            Developer d = new Developer(101, "Developer");
            d.calculateSalary();
            printEmployeeInfo(d);

            Analyast a = new Analyast(102, "analayst");
            a.calculateSalary();
            printEmployeeInfo(a);
        }

		private static void printEmployeeInfo(Employee e)
		{
			Console.WriteLine("\nEmployee Id : " + e.getEmpId());
			Console.WriteLine("Employee Name : " + e.getEmpName());
			Console.WriteLine("Basic Salary : " + e.getBASICPAY());
			Console.WriteLine("Gross Salary : " + e.getGrossSalary());
			if (e is Developer) {
				Developer d = (Developer)e;
				Console.WriteLine("Bonus given to Developer : " + d.getBONUSPERCENT() + "%");
			} 
            else
            {
				Analyast a = (Analyast)e;
				Console.WriteLine("Perks given to Analyast : " + a.getPERKS() + "%");
			}
		}
	}
}
