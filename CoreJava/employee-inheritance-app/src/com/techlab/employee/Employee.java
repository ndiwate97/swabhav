package com.techlab.employee;

public class Employee {
	private float salary;
	private int id;
	private String name;

	public Employee(float salary, int id, String name) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//getters
	
	public float getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
