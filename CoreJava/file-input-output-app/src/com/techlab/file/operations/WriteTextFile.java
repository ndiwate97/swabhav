package com.techlab.file.operations;

import java.io.*;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("C:\\swabhav\\CoreJava\\file-input-output-app\\MyFile.txt", true);
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\swabhav\\CoreJava\\file-input-output-app\\Student.csv"));
		String line = null;
		while ((line = br.readLine()) != null) {
				if (!line.equals("")) {
					String[] data = line.split(",");
					Integer studentId = checkIntData(Integer.parseInt(data[0]));
					String studentName = checkData(data[1]);
					int age = checkIntData(Integer.parseInt(data[2]));
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

		}
		br.close();
		writer.close();

	}

	private static Integer checkIntData(int i) {
		if(i==0)
			return null ;
		else 
			return i;
	}

	private static String checkData(String s) {
		if(s.equalsIgnoreCase("null"))
			return ("");
		else 
			return s;
	}

}
