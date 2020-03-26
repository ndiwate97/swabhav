package com.techlab.rectangle;

public class Rectangle {

	final int START_RANGE=1;
	final int END_RANGE=100;
	
	public int width;
	public int height;
	public String color;

	public void calculateArea() {
		System.out.println("Area of Rectangle = " + (width * height));
	}

	public void display() {
		width=checkDimensions(width);
		height=checkDimensions(height);
		color=checkColor(color);

		System.out.println("Colour of Rectangle ="+ color);
		System.out.println("Width of Rectangle = "+ width);
		System.out.println("Height of Rectangle = "+ height);
	}

	private String checkColor(String colour) {
		if(colour.equals("red") || colour.equals("green") || colour.equals("blue"))
			return (colour);
		else 
			return ("Black");		
	}

	private int checkDimensions(int val) {
		if(val<1)
			return(START_RANGE);
		else if (val>100)
			return(END_RANGE);
		else 
			return(val);
		
	}

}
