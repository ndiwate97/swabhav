package com.techlab.employee.test;

import com.techlab.employee.Programmer;

public class EmployeeTest {

	public static void main(String[] args) {
		Programmer p1 = new Programmer(10000,101,"abc",2000);
		
		printInfo(p1);
	}

	private static void printInfo(Programmer p) {
		
		System.out.println("Id = "+ p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Salary = "+p.getSalary());
		System.out.println("Bonus = "+p.getBonus());
		
	}

}
