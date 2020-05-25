package com.techlab.solution;

public class Square implements IShape {
	
	private int side ;

	public Square(int side) {
		this.side = side;
	}
	
	
	@Override
	public int calculateArea(){
		return side*side;
	}


	@Override
	public void setHeight(int h) {
		this.side = h;
		
	}


	@Override
	public int getHeight() {
		return side;
	}
	
	
}
