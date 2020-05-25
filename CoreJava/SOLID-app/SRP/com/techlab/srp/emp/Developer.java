package com.techlab.srp.emp;

public class Developer  {
	
	private int empId;
	private String empName;
	private final float BASICPAY = 10000;
	private final float BONUSPERCENT = 30; 
	private float grossSalary;
	
	public Developer(int empId, String empName) {
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
	
	public float getBONUSPERCENT() {
		return BONUSPERCENT;
	}
	
	public void calculateSalary() {
		grossSalary = BASICPAY+ (BASICPAY*(BONUSPERCENT/100));
	}
	
	public void printInfo() {
		System.out.println("\nEmployee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Basic Salary : " + BASICPAY);
		System.out.println("Gross Salary : " + grossSalary);
		System.out.println("Bonus given to Developer : " + BONUSPERCENT + "%");
	}
	
}
