package com.techlab.assignment;
/*
 * Write a java program to find all pairs of elements in an integer array,
 * whose sum is equal to a given number?
 * Input Array : [4, 6, 5, -10, 8, 5, 20]
 * Input Number : 10
 * Pairs of elements whose sum is 10 are : 4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10
 */

public class PairOfElements {

	public static void main(String[] args) {

		int[] inputArray = { 4, 6, 5, -10, 8, 5, 20 };
		int inputNumber = 10;

		findPairs(inputArray, inputNumber);

	}

	private static void findPairs(int[] element, int no) {

		System.out.println("Pairs of elements whose sum is " + no + " are :");

		for (int i = 0; i < element.length - 1; i++) {
			for (int j = i + 1; j < element.length; j++) {
				if (element[i] + element[j] == no) {
					System.out.println(element[i] + " + " + element[j] + " = " + no);
				}
			}
		}

	}

}
