package com.techlab.employee;

public abstract class Employee {

	private int empId;
	private String empName;
	protected final float BASICPAY = 10000;
	protected float grossSalary;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
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
	
	public float getGrossSalary() {
		return grossSalary;
	}

	public abstract void calculateSalary();

}
