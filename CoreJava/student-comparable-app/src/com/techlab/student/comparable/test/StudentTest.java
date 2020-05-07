package com.techlab.student.comparable.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlab.student.comparable.Student;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1,"Namrata","Diwate"));
		studentList.add(new Student(3,"Yash","Diwate"));
		studentList.add(new Student(2,"Garvi","Mahadik"));

		System.out.println(studentList);
		
		Collections.sort(studentList);
		
		System.out.println(studentList);
	}

}
