package com.techlab.employee;

public class Analyast extends Employee  {
	private final float PERKS = 20; 
	public Analyast(int empId, String empName) {
		super(empId, empName);
	}
	
	public float getPERKS() {
		return PERKS;
	}

	@Override
	public void calculateSalary() {
		grossSalary = BASICPAY+ (BASICPAY*(PERKS/100));
	}

	
}
