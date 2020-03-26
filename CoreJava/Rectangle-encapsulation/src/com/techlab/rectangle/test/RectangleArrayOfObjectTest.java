package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleArrayOfObjectTest {
	
	public static void main(String args[]) {
		
		Rectangle[] rectangles = new Rectangle[3];

		Rectangle r1 = new Rectangle();
		r1.setHeight(10);
		r1.setWidth(5);
		System.out.println(r1.hashCode());

		Rectangle r2 = new Rectangle();
		r2.setHeight(16);
		r2.setWidth(10);
		System.out.println(r2.hashCode());
		
		rectangles[0] = new Rectangle();
		rectangles[0].setHeight(2);
		rectangles[0].setWidth(-3);
		
		rectangles[1] = r1;
		rectangles[2] = r2;
		
		printInfo(rectangles);
	}
	public static void printInfo(Rectangle[] rec) {

		for(int i =0;i<rec.length;i++) {
			System.out.println("\nOutput of rectangle"+i);
			System.out.println("Height:  "+rec[i].getHeight());
			System.out.println("Width:  "+rec[i].getWidth());
			rec[i].calculateArea();
			System.out.println("hashCode if rec "+ i+" :  "+rec[i].hashCode());
		}
	}

}
