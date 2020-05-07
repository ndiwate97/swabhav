package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		/*
		Student s1 = new Student(101,"abc");
		System.out.println("StudentCount on creating s1 : "+s1.getStudentCount());
				
		Student s2 = new Student(102,"xyz");
		System.out.println("StudentCount on creating s2 : "+s2.getStudentCount());
		
		Student s3 = new Student(103, "lmno", 8.0f);
		System.out.println("StudentCount on creating s3 : "+s3.getStudentCount());
		
		s3.display();*/
		
		 	Student s1 = new Student(22,"Tanmay",8.5f);
			System.out.println(s1.getStudentCount());
			
			Student s2 = new Student(22,"Tanmay",8.5f);
			System.out.println(s2.getStudentCount());
			
			Student s3 = new Student(22,"Tanmay");
			System.out.println(s3.getStudentCount());
			
//		case 1: calling s1.getStudentCount() after each object creation.
			/* output
			 	We are in static block
				We are in constructor
				1
				We are in constructor
				2
				We are in constructor
				3
			 */
			
//		case 2: calling getStudentCount() after each object creation with its respective object name
			/* output
			 	We are in static block
				We are in constructor
				1
				We are in constructor
				2
				We are in constructor
				3	
			 */
			
//		case 3:
			
			System.out.println("Head count = "+Student.headCount());
			System.out.println("Head count = "+s1.headCount());
			/*
			 * both statement is giving same output but 
			 * The static method should be accessed in a static way
			 * that is by using class name
			 */
			
//			Student. will only give access to static methods and variables
	}
}
