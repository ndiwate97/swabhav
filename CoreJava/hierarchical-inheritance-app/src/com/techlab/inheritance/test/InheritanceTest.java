package com.techlab.inheritance.test;

import com.techlab.man.*;

public class InheritanceTest {
	public static void main(String[] args) {
		Man m = new Man();
		Boy b = new Boy();
		Kid k = new Kid();
		Infant i = new Infant();
		
//		case1();
//		case2();
//		case3();
		case5();
//		atThePark(i);
		
	}
	public static void atThePark(Man m) {
		System.out.println("At the park");
		m.plays();
	}
	
	public static void case1() {
		Man x;//reference variable
		x = new Man();
		x.plays();
		x.reads();
	}

	public static void case2() {
		Boy y;
		y = new Boy();
		y.plays();
		y.eats();
		y.reads();
	}
	
	public static void case3() {
		Man x;
		x = new Boy();
		x.plays();
		x.reads();
	}
	
//	public void case4() {
//		atThePark(new Man());
//		atThePark(new Boy());
//		atThePark(new Kid());
//		atThePark(new Infant());
//	}

	public static void case5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	} 

	
}
