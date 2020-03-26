package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleReferenceTest {

	public static void main(String[] args) {

		Circle[] circles = new Circle[5];

		Circle c0 = new Circle();
		c0.setColor("red");
		c0.setRadius(5);
		circles[0] = c0;

		Circle c1 = new Circle();
		c1.setColor("Yellow");
		c1.setRadius(15);
		circles[1] = c1;

		Circle c2 = new Circle();
		c2.setColor("Black");
		c2.setRadius(20);
		circles[2] = c2;

		Circle c3 = new Circle();
		c3.setColor("White");
		c3.setRadius(07);
		circles[3] = c3;

		Circle c4 = new Circle();
		c4.setColor("Blue");
		c4.setRadius(25);
		circles[4] = c4;

		for (int i = 0; i < circles.length; i++) {
			printInformation(circles[i]);
		}

		// case 4:
		System.out.println("\nRadius of smallest circle is " + findSmallCircle(circles));
		System.out.println("\nDetails of smallest circle:");
		printInformation(smallCircleDetail(circles));
		
		//case 5:
		bigCircleCircumference(bigCircleRadius(circles));
		bigCircleArea(bigCircleRadius(circles));

	}

	

	


	private static void printInformation(Circle c) {
		
			System.out.println("\nRadius of Circle is " + c.getRadius());
			System.out.println("Color of Circle is " + c.getColor());

			c.calculateArea();
			c.calculateCircumference();
		
	}

	private static float findSmallCircle(Circle[] c) {
		float smallRadius = c[0].getRadius();
		for (int i = 1; i < c.length; i++) {
			if (smallRadius > c[i].getRadius())
				smallRadius = c[i].getRadius();
		}
		return smallRadius;
	}

	private static Circle smallCircleDetail(Circle[] c) {
		float smallRadius = c[0].getRadius();
		int objectNo = 0;
		for (int i = 1; i < c.length; i++) {
			if (smallRadius > c[i].getRadius()) {
				smallRadius = c[i].getRadius();
				objectNo = i;
			}

		}

		return c[objectNo];

	}
	
	/*case 5
	 * create one method with name bigPerimeterCircleDetails which return perimeter
	 *  and bigAreaCircleDetails which returns Area
	 *  which will find out the circle with biggest perimeter
	 */
	private static Circle bigCircleRadius(Circle[] c) {
			float bigRadius = c[0].getRadius();
			int objectNo = 0;
			for (int i = 1; i < c.length; i++) {
				if (bigRadius < c[i].getRadius()) {
					bigRadius = c[i].getRadius();
					objectNo = i;
				}

			}

			return c[objectNo];

		}
	
	private static void bigCircleCircumference(Circle c) {
		System.out.println("\nFor Big Circle:");
		c.calculateCircumference();
	}
	
	private static void bigCircleArea(Circle c) {
		System.out.println("\nFor Big Circle:");
		c.calculateArea();
	}

	

}
