package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {
	
	public static void main(String[] args) {
		//for width and height -ve values should reset to 1 and values >100 should be reset to 100
	Rectangle r1=new Rectangle();
	r1.width=-2;
	r1.height=200;
	r1.color="white";
	r1.display();
	r1.calculateArea();
	}

}


/*add one more attribute color in rectangle class and keep values of color
as red green and blue, if we are entering any other color it should get reset to black
*/