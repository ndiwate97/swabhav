package com.techlab.rectangle;

public class Rectangle {

	final int START_RANGE=1;
	final int END_RANGE=100;
	
	//make this private and use getters and setters  
	private int width;
	private int height;
	private String color;
	
	//getter
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getColour() {
		return color;
	}
	
	
	//setter
	public void setWidth(int width) {
		this.width = checkDimensions(width);
	}
	
	public void setHeight(int height) {
		this.height = checkDimensions(height);
	}
	
	public void setColor(String color) {
		this.color = checkColor(color);
	}
	
	
	public void calculateArea() {
		System.out.println("Area of Rectangle = " + (width * height));
	}

	

	private String checkColor(String colour) {
		if(colour.equalsIgnoreCase("red") || colour.equalsIgnoreCase("green") || colour.equalsIgnoreCase("blue"))
			return (colour);
		else 
			return ("Black");		
	}

	private int checkDimensions(int val) {
		if(val<START_RANGE)
			return(START_RANGE);
		else if (val>END_RANGE)
			return(END_RANGE);
		else 
			return(val);
		
	}


}
