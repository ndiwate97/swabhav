package com.techlab.candidate;

public class Candidate {
	private static int defaultId=0;
	private int id, age;
	private String name;
	private CreditPoint creditPoint;

	public Candidate(int id, int age, String name, CreditPoint creditPoint) {
		this.id = checkID(id);
		this.name = checkName(name);
		this.age = age;
		this.creditPoint = creditPoint;
	}

	private String checkName(String s) {
		if(s.equals(" ")||s.equals("null"))
			return "Unspecified";
		else
			return s;
	}

	private int checkID(int id) {
		if(id<0)
			return ++defaultId;
		else
			return id;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public CreditPoint getCreditPoint() {
		return creditPoint;
	}
}
