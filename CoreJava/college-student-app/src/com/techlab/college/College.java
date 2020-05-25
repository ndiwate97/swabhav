package com.techlab.college;

import java.util.*;

public class College {
	
	private String clgName;
	private String clgAddress;
	private List<Student> students = new ArrayList<Student>();
	
	public College(String clgName, String clgAddress) {
		this.clgName = clgName;
		this.clgAddress = clgAddress;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void removeStudent(String studentName) {

		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			Student books = (Student) iterator.next();
			if (books.getName().equalsIgnoreCase(studentName))
				iterator.remove();

		}
	}

	public void searchByStudentName(String studentName) {

		List<Student> bookByAuthor = new ArrayList<Student>();
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			Student book = (Student) iterator.next();
			if (book.getName().equalsIgnoreCase(studentName))
				bookByAuthor.add(book);
		}

		if (!bookByAuthor.isEmpty()) {
			System.out.println("List of students with name "+studentName+ ":");
			System.out.println(bookByAuthor);
		}
		else {
			System.err.println("There is no student called "+studentName);
		}
	}

	public String getClgName() {
		return clgName;
	}

	public String getClgAddress() {
		return clgAddress;
	}

	public List<Student> getStudents() {
		return students;
	}

	
	
}
