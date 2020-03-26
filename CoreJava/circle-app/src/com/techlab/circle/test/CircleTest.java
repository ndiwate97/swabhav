package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setColor("red");
		c.setRadius(10);
		
		System.out.println("Color of Circle is "+c.getColor());
		System.out.println("Radius of Circle is "+c.getRadius());
		
		c.calculateArea();
		c.calculateCircumference();
	}
}
