package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleRefTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
		System.out.println("r1.hashcode="+r1.hashCode());
		
		Rectangle r2;
		r2=r1;
		System.out.println("\nr2.hashcode="+r2.hashCode());

		r2.setWidth(r2.getWidth()+1);
		r2.setHeight(r2.getHeight()+1);

		System.out.println(r1.getWidth());
		System.out.println(r1.getHeight());

		System.out.println(r2.getWidth());
		System.out.println(r2.getHeight());
		
		Rectangle r3 = new Rectangle();
		System.out.println("\nr3.hashcode="+r3.hashCode());
		r2=r3;
		System.out.println("\nr2.hashcode (after r2=r3) ="+r2.hashCode());
		System.out.println(r2.getHeight());
		
		//printInfo(r1);


	}

	public static void printInfo(Rectangle r) {
		// rectangle r1 .is a reference variable which is expecting an object of
		// Rectangle Class
		System.out.println("Colour of Rectangle =" + r.getColour());
		System.out.println("Width of Rectangle = " + r.getWidth());
		System.out.println("Height of Rectangle = " + r.getHeight());

		System.out.println(r.hashCode());
	}
}
