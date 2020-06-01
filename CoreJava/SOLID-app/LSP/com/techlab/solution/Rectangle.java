package com.techlab.solution;

public class Rectangle implements IShape {
	
	protected int width;
	protected int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public int calculateArea(){
		return width*height;
	}

}