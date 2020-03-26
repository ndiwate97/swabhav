package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1,"name1","java");
		
		Student s2 = new Student(2, "name2", "advJava", 10000);
		
		s1.display();
		s2.display();
	}
}
