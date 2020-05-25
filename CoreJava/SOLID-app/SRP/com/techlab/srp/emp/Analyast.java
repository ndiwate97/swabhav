package com.techlab.srp.emp;

public class Analyast  {
	
	private int empId;
	private String empName;
	private final float BASICPAY = 10000;
	private final float PERKS = 20;
	private float grossSalary;
	
	public Analyast(int empId, String empName) {
		this.empId= empId;
		this.empName= empName;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getBASICPAY() {
		return BASICPAY;
	}
	
	public float getPERKS() {
		return PERKS;
	}

	public void calculateSalary() {
		grossSalary = BASICPAY+ (BASICPAY*(PERKS/100));
	}
	
	public void printInfo() {
		System.out.println("\nEmployee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Basic Salary : " + BASICPAY);
		System.out.println("Gross Salary : " + grossSalary);
		System.out.println("Perks given to Analyast : " + PERKS + "%");
	}

	
}
