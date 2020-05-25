package com.techlab.college;

import java.util.Date;

public class Student {

	private int id;
	private String name;
	private String address;
	private Date dateOfBirth;
	private Branch branch;

	public Student(int id, String name, String address, Date dateOfBirth, Branch branch) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Branch getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "\nStudent Id =" + id + ", Name = " + name + ", Address = " + address + ", Date Of Birth = " + dateOfBirth
				+ ", Branch=" + branch;
	}

}
