package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleAnonymousTest {

	public static void main(String args[]) {
		System.out.println(new Rectangle().hashCode()); // output
		System.out.println(new Rectangle().hashCode());

		new Rectangle().setHeight(5);
		new Rectangle().setWidth(10);
		System.out.println(new Rectangle().getHeight()); // output
		System.out.println(new Rectangle().hashCode());
		System.out.println(new Rectangle().getWidth());
		System.out.println(new Rectangle().hashCode());

		printInfo(new Rectangle());
		

	}

	public static void printInfo(Rectangle r) {
		
		System.out.println(r.hashCode());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		r.calculateArea();
	}

}

/*
 * Anonymous simply means nameless. An object which has no reference is known as
 * an anonymous object. 
 * 
 * It is used when we have to use an object only once.
 * 
 * each time Anonymous object is created new memory is allocate to it.
 * so we can retrieve the data that is once set using Anonymous object.
 */