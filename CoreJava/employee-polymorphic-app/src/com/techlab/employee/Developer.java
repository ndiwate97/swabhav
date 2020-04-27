package com.techlab.employee;

public class Developer extends Employee {
	private final float BONUSPERCENT = 30; 
	public Developer(int empId, String empName) {
		super(empId, empName);
	}

	public float getBONUSPERCENT() {
		return BONUSPERCENT;
	}
	
	
	@Override
	public void calculateSalary() {
		grossSalary = BASICPAY+ (BASICPAY*(BONUSPERCENT/100));
	}
	
	
}
