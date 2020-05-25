package com.techlab.violaton.test;

import com.techlab.violaton.*;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(30, 20);
		System.out.println(shouldNotChangeWidthIfHegihtChanges(r1));

		Square s1 = new Square(30);
		System.out.println(shouldNotChangeWidthIfHegihtChanges(s1));
		
	}


	private static boolean shouldNotChangeWidthIfHegihtChanges(Rectangle obj) {
		int before = obj.getWidth();
		System.out.println("before width :" + obj.getWidth() + " height : " + obj.getHeight());
		System.out.println("area : "+obj.calculateArea());
		
		obj.setHeight(obj.getHeight() + 10);

		int after = obj.getWidth();
		System.out.println("after width : " + obj.getWidth() + " height : " + obj.getHeight());
		System.out.println("area : "+obj.calculateArea());
		if (before == after) {
			return true;
		}
		return false;

	}

}
