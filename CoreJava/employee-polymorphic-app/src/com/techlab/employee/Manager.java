package com.techlab.employee;

public class Manager extends Employee  {
	
	private final float HRA = 50; 
	private final float TA = 40; 
	private final float DA = 30; 

	public Manager(int empId, String empName) {
		super(empId, empName);
	}
//	getters
	public float getHRA() {
		return HRA;
	}
	
	public float getDA() {
		return DA;
	}
	
	public float getTA() {
		return TA;
	}
	
	@Override
	public void calculateSalary() {
		grossSalary = BASICPAY + (BASICPAY*(HRA/100)) + (BASICPAY*(TA/100)) + (BASICPAY*(DA/100));
	}

	
}
