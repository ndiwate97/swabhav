package com.headfirst.chapter3;

public class Triangle {

	double area;
	int height;
	int length;

	public static void main(String [] args) {
		Triangle[] ta = new Triangle[4];								//__________
		int x = 0;														//__________
		while ( x<4 ) {													//__________
		ta[x] = new Triangle();											//__________
		ta[x].height = (x + 1) * 2;										//________.height 
		ta[x].length = x + 4;											//________.length
		ta[x].setArea();												//__________________________
		System.out.print("triangle "+x+", area");
		System.out.println(" = " + ta[x].area);							//_______.area
		x = x + 1;														//__________
		}
		int y = x;														//__________
		x = 27;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", t5 area = "+ t5.area);
		}

	void setArea() {
		 area = (height * length) / 2;
	}

}
