package com.techlab.student.comparator.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlab.student.comparator.*;


public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1,"Namrata","Diwate"));
		studentList.add(new Student(3,"Yash","Diwate"));
		studentList.add(new Student(2,"Garvi","Mahadik"));

		System.out.println("\nUnSorted list");
		System.out.println(studentList);
		
		Collections.sort(studentList, new FirstNameSorter());
		System.out.println("\nSorted by First Name");
		System.out.println(studentList);
		
		Collections.sort(studentList, new LastNameSorter());
		System.out.println("\nSorted by Last Name");
		System.out.println(studentList);
		
		Collections.sort(studentList, new RollNoSorter());
		System.out.println("\nSorted by Roll No ");
		System.out.println(studentList);
	}

}
