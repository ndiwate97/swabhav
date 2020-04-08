package com.techlab.student.test;

import com.techlab.student.Student;
import java.util.*;
import java.io.*;

public class StudentTest {
	static String filePath = "C:\\swabhav\\CoreJava\\file-input-output-app\\Student.csv";

	public static void main(String[] args) throws IOException {
		
		Student s1= new Student();
		s1.setId(101);
		s1.setName("Namrata");
		s1.setAge(23);
		s1.setGender("female");

		Student s2= new Student();
		s2.setId(101);
		s2.setName("yash");
		s2.setAge(16);
		s2.setGender("male");
		
		System.out.println(s1.equals(s2));
		
		List<Student> list = readStudentdetails();
		System.out.println(list.size());
		
		System.out.println(list);
//		System.out.println(list.toString());
	}

	private static List<Student> readStudentdetails() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = null;

		List<Student> students = new ArrayList();
		while ((line = br.readLine()) != null) {
			if (!line.equals("")) {
				String[] data = line.split(",");
				Student s1 = new Student();
				s1.setId(Integer.parseInt(data[0]));
				s1.setName(data[1]);
				s1.setAge(Integer.parseInt(data[2]));
				s1.setGender(data[3]);
				students.add(s1);

			}
		}

		return students;
	}

}
