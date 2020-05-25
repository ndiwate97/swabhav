package com.techlab.college.test;

import java.sql.Date;

import com.techlab.college.*;

public class CollegeTest {


	public static void main(String[] args) {
		
		College c = new College("New College", "Mumbai");
		admitStudents(c);
		
		printStudentsinfo(c);
		
		c.removeStudent("Stephen King");		
		printStudentsinfo(c);
		
		c.searchByStudentName("J.K. Rowling");
	
	}

	private static void printStudentsinfo(College c) {
		System.out.println(c.getClgName()+"\n"+c.getClgAddress());
		System.out.println(c.getStudents()+"\n");
	}

	private static void admitStudents(College c) {

		c.addStudent(new Student(101, "John Grisham","Mumbai",new Date(97,8,30), Branch.COMP));

		c.addStudent(new Student(102, "Stephen King","Andheri",new Date(97,8,30) , Branch.EXTC));

		c.addStudent(new Student(103,  "David Baldacci", "Thane",new Date(97,8,30), Branch.IT));

		c.addStudent(new Student(104,  "J.K. Rowling", "Thane", new Date(97,8,30), Branch.IT ));
		
		c.addStudent(new Student(105, "HARRY POTTER ", "Ulhasnagar", new Date(97,8,30), Branch.MEC));
	}
}


