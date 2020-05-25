package com.techlab.employee;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class UrlLoader implements ILoadAble {

	private String inputUrl = "https://swabhav-tech.firebaseapp.com/emp.txt";

	@Override
	public void setSource(String inputUrl) {
		this.inputUrl = inputUrl;
	}

	@Override
	public ArrayList<String> loadData() throws Exception {

		URL url = new URL(inputUrl);

		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

		ArrayList<String> lines = new ArrayList<String>();
		String line;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}

		System.out.println("in urlloader");
		reader.close();
		return lines;

	}

}
