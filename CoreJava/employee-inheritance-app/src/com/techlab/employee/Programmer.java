package com.techlab.employee;

public class Programmer extends Employee{
	private float bonus;
	
	public Programmer(float salary, int id, String name, float bonus) {
		super(salary,id,name);
		this.bonus=bonus;
	}
	
	public float getBonus() {
		return bonus;
	}
}
