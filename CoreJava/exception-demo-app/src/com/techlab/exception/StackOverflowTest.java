package com.techlab.exception;

public class StackOverflowTest {

	public static void main(String[] args) {
		System.out.println("I'm inside main..");
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void m1() {
		System.out.println("I'm inside m1..");
		main(null);
		m2();	
	}

	private static void m2() {
		System.out.println("I'm inside m2..");
	}

}