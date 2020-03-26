package com.techlab.circle;

public class Circle {
	
	private final int START_RANGE=1;
	private final int END_RANGE=100;
	
	private final float PI = 3.14f; 
	private float radius;
	private String color;
	
	//setters
	public void setRadius(float radius ) {
		this.radius = checkDimension(radius);
	}
	
	public void setColor(String color) {
		this.color = checkColor(color);
	}
	
	//getters
	public float getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}

	//check functions
	private float checkDimension(float value) {
		if(value<START_RANGE)
			return(START_RANGE);
		else if (value>END_RANGE)
			return(END_RANGE);
		else 
			return(value);
	}
	
	private String checkColor(String colour) {
		if(colour.equalsIgnoreCase("red") || colour.equalsIgnoreCase("green") || colour.equalsIgnoreCase("blue"))
			return (colour);
		else 
			return ("Black");		
	}
	
	//Calculations
	
	public void calculateArea() {
		float area = PI*radius*radius;
		System.out.println("Area of circle is " + area);
	}
	
	public void calculateCircumference() {
		float circumference = 2*PI*radius;
		System.out.println("Circumference of circle is " + circumference);
	}

}
