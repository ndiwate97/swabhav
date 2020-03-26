package com.techlab.rectangle.test;
import com.techlab.rectangle.Rectangle;

public class RectanglePrintTest {
	
	public static void main(String[] args) {
		// for width and height -ve values should reset to 1 and values >100 should be
		// reset to 100
		Rectangle r1 = new Rectangle();

		r1.setWidth(-10);
		r1.setHeight(200);
		r1.setColor("ReD");
		r1.calculateArea();

		printInfo(r1);

		System.out.println(r1.hashCode());

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
