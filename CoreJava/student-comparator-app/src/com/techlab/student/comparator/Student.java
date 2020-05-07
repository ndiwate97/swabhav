package com.techlab.student.comparator;

public class Student {
	private int rollNo;
	private String fName;
	private String lName;

	public Student(int rollNo, String fName, String lName) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	@Override
	public String toString() {
		return " \nRoll No = " + rollNo + ", First Name = " + fName + ", Last Name=" + lName;
	}
}
