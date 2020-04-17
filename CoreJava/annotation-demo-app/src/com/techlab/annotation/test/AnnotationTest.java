package com.techlab.annotation.test;

import java.lang.reflect.*;
import java.text.Annotation;

import com.techlab.annotation.RequireRefactor;

import java.lang.annotation.*;

public class AnnotationTest {
	static int count = 0;
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class cls = Class.forName("com.techlab.annotation.Foo");

		Method[] methods = cls.getMethods();
		System.out.print("Name of method having annotation : ");
		for (Method method : methods) {
			if (method.isAnnotationPresent(RequireRefactor.class)) {
				count++;
				System.out.print(method.getName()+" ");
				
			}
		}
		
		
		System.out.println("\nNo of method having annoation : "+count);
	}

}
