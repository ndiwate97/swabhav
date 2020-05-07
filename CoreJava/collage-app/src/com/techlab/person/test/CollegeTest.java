package com.techlab.person.test;

import java.util.Date;

import com.techlab.person.*;

public class CollegeTest {

	public static void main(String[] args) {

		Student s = new Student(1, "Namrata", "Ulhasnagar", new Date(97, 8, 30), Branch.COMP);

		printBasicInfo(s);

		Professer p = new Professer(101, "Sonam", "Andheri", new Date(93, 3, 15), 15000);

		printBasicInfo(p);
	}

	private static void printBasicInfo(Person p) {

		System.out.println("\nId : " + p.getId());
		System.out.println("Name : " + p.getName());
		System.out.println("Address : " + p.getAddress());
		System.out.println("Date Of Birth : " + p.getDateOfBirth());

		if (p.getClass().equals(Student.class)) {
			Student s = (Student) p;
			System.out.println("Branch : " + s.getBranch());
		} else if (p.getClass().equals(Professer.class)) {
			Professer pr = (Professer) p;
			System.out.println("Basic Pay : " + pr.getBasicSalary());
			System.out.println("Total Salary : " + pr.getGrossSalary());
		} else {
			System.out.println("No more information fount...!");
		}

	}

}
