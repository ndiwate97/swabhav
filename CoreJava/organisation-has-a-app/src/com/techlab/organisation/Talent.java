package com.techlab.organisation;

public class Talent {

	private int id;
	private String name;
	private double cgpa;

	public Talent(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "\nId = " + id + ", Name = " + name + ", CGPA = " + cgpa;
	}

}
