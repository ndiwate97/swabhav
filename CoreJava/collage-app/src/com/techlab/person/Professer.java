package com.techlab.person;

import java.util.Date;

public class Professer extends Person {
	private float basicSalary;
	private final float HRA = 50; 
	private final float TA = 40; 
	private float grossSalary;
	
//	constructor
	public Professer(int id, String name, String address, Date dateOfBirth, float basicSalary) {
		super(id, name, address, dateOfBirth);
		this.basicSalary = basicSalary;
		
	}
	
//	getters
	public float getBasicSalary() {
		return basicSalary;
	}

	public float getGrossSalary() {
		calculateSalary();
		return grossSalary;
	}
	
//	calculating gross salary
	public void calculateSalary() {
		grossSalary = basicSalary + (basicSalary*(HRA/100)) + (basicSalary*(TA/100));
	}


}
