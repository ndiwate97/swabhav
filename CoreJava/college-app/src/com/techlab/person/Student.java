package com.techlab.person;

import java.util.Date;

public class Student extends Person {
	private Branch branch;

	public Student(int id, String name, String address, Date dateOfBirth, Branch branch) {
		super(id, name, address, dateOfBirth);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}
	
	
}
