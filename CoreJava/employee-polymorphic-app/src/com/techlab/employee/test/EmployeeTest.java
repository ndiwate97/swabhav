package com.techlab.employee.test;

import com.techlab.employee.*;

public class EmployeeTest {

	public static void main(String[] args) {

		Developer d = new Developer(101, "Developer");
		d.calculateSalary();
		printEmployeeInfo(d);

		Analyast a = new Analyast(102, "analayst");
		a.calculateSalary();
		printEmployeeInfo(a);

		Manager m = new Manager(103, "Manager");
		m.calculateSalary();
		printEmployeeInfo(m);

	}

	private static void printEmployeeInfo(Employee e) {
		System.out.println("\nEmployee Id : " + e.getEmpId());
		System.out.println("Employee Name : " + e.getEmpName());
		System.out.println("Basic Salary : " + e.getBASICPAY());
		System.out.println("Gross Salary : " + e.getGrossSalary());
		if (e instanceof Developer) {
			Developer d = (Developer) e;
			System.out.println("Bonus given to Developer : " + d.getBONUSPERCENT() + "%");
		} else if (e instanceof Analyast) {
			Analyast a = (Analyast) e;
			System.out.println("Perks given to Analyast : " + a.getPERKS() + "%");
		} else {
			Manager m = (Manager) e;
			System.out.println("HRA  : " + m.getHRA() + "%");
			System.out.println("DA : " + m.getDA() + "%");
			System.out.println("TA : " + m.getTA() + "%");
		}
	}
}
