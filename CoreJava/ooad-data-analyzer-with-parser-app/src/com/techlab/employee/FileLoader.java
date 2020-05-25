package com.techlab.employee;

import java.io.*;
import java.util.ArrayList;

public class FileLoader implements ILoadAble {

	private String path = "..\\ooad-data-analyzer-with-parser-app\\src\\dataFile_emp.txt";

	@Override
	public void setSource(String path) {
		this.path = path;
	}

	@Override
	public  ArrayList<String> loadData() throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader(path));

		ArrayList<String> lines = new ArrayList<String>();
		String line;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}

		System.out.println("in file loader");
		reader.close();
		return lines;
		
	}

}
