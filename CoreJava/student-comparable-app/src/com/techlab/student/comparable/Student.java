package com.techlab.student.comparable;

public class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student o) {

		if (rollNo == o.rollNo)
			return 0;
		else if (rollNo > o.rollNo)
			return 1;
		else
			return -1;

	}

}
