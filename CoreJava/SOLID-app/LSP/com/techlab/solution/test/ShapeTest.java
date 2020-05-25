package com.techlab.solution.test;

import com.techlab.solution.*;

public class ShapeTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(30, 20);
		giveArea(r1);
		
		System.out.println();
		
		Square s1 = new Square(10);
		giveArea(s1);
	}

	private static void  giveArea(IShape obj) {

		System.out.println("area : " + obj.calculateArea());

		obj.setHeight(obj.getHeight()+10);
		
		System.out.println("area after height increase : "+obj.calculateArea());
	}

}
