package com.techlab.srp.emp;


public class EmployeeTest {

	public static void main(String[] args) {

		Developer d = new Developer(101, "Developer");
		d.calculateSalary();
		d.printInfo();
		

		Analyast a = new Analyast(102, "analayst");
		a.calculateSalary();
		a.printInfo();
	}

	
//	perfect Solution
	
	/*
	private static void printEmployeeInfo(Employee e) {
		System.out.println("\nEmployee Id : " + e.getEmpId());
		System.out.println("Employee Name : " + e.getEmpName());
		System.out.println("Basic Salary : " + e.getBASICPAY());
		System.out.println("Gross Salary : " + e.getGrossSalary());
		if (e instanceof Developer) {
			Developer d = (Developer) e;
			System.out.println("Bonus given to Developer : " + d.getBONUSPERCENT() + "%");
		} else {
			Analyast a = (Analyast) e;
			System.out.println("Perks given to Analyast : " + a.getPERKS() + "%");
		}
	}
	*/
}
