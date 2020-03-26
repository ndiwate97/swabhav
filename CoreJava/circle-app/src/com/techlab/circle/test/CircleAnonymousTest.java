package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleAnonymousTest {
	
	public static void main(String[] args) {
		Circle[] circles = new Circle[4];

		circles[0] = new Circle();
		circles[0].setColor("red");
		circles[0].setRadius(5);

		Circle c1 = new Circle();
		c1.setColor("Yellow");
		c1.setRadius(15);
		circles[1] = c1;

		Circle c2 = new Circle();
		c2.setColor("Black");
		c2.setRadius(20);
		circles[2] = c2;

		circles[3] = new Circle();
		circles[3].setColor("blue");
		circles[3].setRadius(07);
		
		printInformation(circles);

	}

	private static void printInformation(Circle[] c) {
		
		for (int i = 0; i < c.length; i++) {

			System.out.println("\nRadius of Circle is " + c[i].getRadius());
			System.out.println("Color of Circle is " + c[i].getColor());
			c[i].calculateArea();
			c[i].calculateCircumference();
		}
		
	}

}
