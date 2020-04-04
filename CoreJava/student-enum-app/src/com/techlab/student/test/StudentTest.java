package com.techlab.student.test;
import com.techlab.student.Student;
import com.techlab.student.enums.*;

public class StudentTest {
	
	public static void main(String[] args) {
		Student c1 = new Student("abc", "30-01-97", Branch.COMP, GradePoint.A);
		printInfo(c1);
		
		Student c2 = new Student("xyz", "30-01-97", Branch.EXTC, GradePoint.A1);
		printInfo(c2);
	}

	private static void printInfo(Student c) {
		System.out.println("\nId = "+c.getId());
		System.out.println("Name = "+c.getName());
		System.out.println("Date Of Birth = "+c.getDateOfBirth());
		System.out.println("Grade Point = "+c.getGradePoint());
	}

}
