package com.techlab.file.operations;

import java.io.*;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("C:\\swabhav\\CoreJava\\file-input-output-app\\MyFile.txt", true);
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\swabhav\\CoreJava\\file-input-output-app\\Student.csv"));
		String line = null;
		while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				String studentId = checkData(data[0]);
				String studentName = checkData(data[1]);
				String age = checkData(data[2]);
				String gender = checkData(data[3]);

				System.out.println("id = " + studentId);
				System.out.println("name = " + studentName);
				System.out.println("Age = " + age);
				System.out.println("gender = " + gender);

				writer.write("\tID = " + studentId);
				writer.write("\tName = " + studentName);
				writer.write("\tAge = " + age);
				writer.write("\tGender = " + gender);
				writer.write("\n\n");

		}
		br.close();
		writer.close();

	}

	private static String checkData(String s) {
		if(s.equalsIgnoreCase("null") ||  s.equals("0"))
			return ("");
		else 
			return s;
	}

}
