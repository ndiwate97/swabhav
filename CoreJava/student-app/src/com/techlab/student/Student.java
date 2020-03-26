package com.techlab.student;

public class Student {
	
	private int rollNo;
	private String name;
	private String course;
	private float fees;
	
	public Student(int rollNo,String name,String course) {
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	
	public Student(int rollNo,String name,String course, float fees) {
		this(rollNo,name,course);
		this.fees=fees;
	}
	
	public void display() {
		System.out.println("\nRoll no : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Course : "+course);
		System.out.println("Fees : "+fees);
	}

}
