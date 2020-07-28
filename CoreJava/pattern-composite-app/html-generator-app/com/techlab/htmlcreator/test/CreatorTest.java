package com.techlab.htmlcreator.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

import com.techlab.htmlcreator.*;

public class CreatorTest {
	
	public static void main(String[] args) {
		
		System.out.println("prog start");
		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");
		

		html.addControl(body);

		body.addControl(div);
		
		div.addControl(new Control("input", "text", "username"));
		div.addControl(new Control("br"));
		
		StringBuilder sb = html.parseHtml();
		writeCode(sb);
		
		createHtmlFile(sb);
	}

	private static void createHtmlFile(StringBuilder sb) {
		
		try {
			FileWriter file = new FileWriter("C:\\swabhav\\CoreJava\\pattern-composite-app\\src\\testfile.html");
			file.write(sb.toString());
			file.close();
		} catch (Exception e) {
			
		}
	}

	private static void writeCode(StringBuilder sb) {
		System.out.println(sb.toString());
	}

}
