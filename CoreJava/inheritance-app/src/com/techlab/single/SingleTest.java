package com.techlab.single;

public class SingleTest {
	
	public static void main(String[] args) {
		
		/*
		 * ChildClass c = new ChildClass();
		 * 
		 * c.childMessagePrint(); c.parentMessagePrint();
		 */
		
		ChildClass c1 = new ChildClass(100);
		System.out.println(c1.getValue());

		ChildClass c2 = new ChildClass(200);
		System.out.println(c2.getValue());

		ChildClass c3 = new ChildClass(500);
		System.out.println(c3.getValue());
	}

}
