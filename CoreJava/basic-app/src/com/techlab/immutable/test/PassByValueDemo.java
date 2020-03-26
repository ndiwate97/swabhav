package com.techlab.immutable.test;

public class PassByValueDemo {

	public static void main(String[] args) {

		int no = 10;
		printNumber(no);
		System.out.println(no);

		int[] arr = { 10, 20, 30, 40 };
		printArrayvalue(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] = 0);
		}

	}

	static void printNumber(int number) {
		number = 20;
	}

	static void printArrayvalue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

	}
}
