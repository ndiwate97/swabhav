package com.techlab.student;

import java.util.jar.Attributes.Name;

public class Student {

	private int id, testNO;
	private String name;
	private float cgpa;
	private final static float DEFAULT_CGPA = 7.0f;
	private static int studentCount;
	
	//is there any difference btwn final static and static final
	//final key word can b used with var, methods and classes.
	
	static {
		studentCount = 0;
		System.out.println("We are in static block");
	}
	
	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		studentCount++;
		System.out.println("We are in constructor");
	}

	public Student(int id, String name) {
		this(id, name, DEFAULT_CGPA);
	}
	
	
	 public void display() {
		System.out.println("\nRoll no : " + id);
		System.out.println("Name : " + name);
		System.out.println("CGPA : " + cgpa);
	}

	public int getStudentCount() {
		return studentCount;
	}
	
	public static int headCount() {
		return studentCount;
	}

}
