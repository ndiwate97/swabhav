package com.headfirst.chapter1;

public class Shuffle1 {

	public static void main(String[] args) {
		int x = 3;

		while (x > 0) {
			if (x > 2) {
			System.out.print("a");
			}
			
			x = x - 1;
			System.out.print("-");
			
			if (x == 2) {
			System.out.print("c b");
			}

			if (x == 1) {
			System.out.print("d");
			x = x - 1;
			}

			
		}
	}
	
	
	//a-c b-d
}
