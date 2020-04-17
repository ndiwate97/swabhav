package com.techlab.custom.annotation.test;

import java.lang.reflect.*;
import java.text.Annotation.*;
import com.techlab.custom.annotation.Test;
import java.lang.annotation.*;

public class AnnotationTest {
	static int count = 0;
	static int passCase = 0;
	static int failCase = 0;

	public static void main(String[] args) throws ClassNotFoundException {

		Class cls = Class.forName("com.techlab.custom.annotation.Foo");

		Method[] methods = cls.getDeclaredMethods();

		System.out.print("Name of method having annotation : ");
		
		for (Method method : methods) {
			
			if (method.isAnnotationPresent(Test.class)) {
				count++;
				passCase++;
				System.out.print(method.getName() + " ");

			} else 
				failCase++;
				
		}

		System.out.println("\nNo of method having annoation : " + count);
		System.out.println("Passed test case : " + passCase);
		System.out.println("Failed test case :" + failCase);
	}

}
