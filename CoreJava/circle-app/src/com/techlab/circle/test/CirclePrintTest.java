package com.techlab.circle.test;

import com.techlab.circle.Circle;


public class CirclePrintTest {
	public static void main(String[] args) {
		
		Circle small = new Circle();
		small.setColor("red");
		small.setRadius(10);
		
		Circle big = new Circle();
		big.setColor("red");
		big.setRadius(20);
		
		printInformation(small);
		printInformation(big);
	}

	private static void printInformation(Circle c) {
		
		System.out.println("\nRadius of Circle is "+c.getRadius());
		System.out.println("Color of Circle is "+c.getColor());
		
		c.calculateArea();
		c.calculateCircumference();
		
	}
	
}
