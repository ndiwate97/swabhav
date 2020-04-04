package com.techlab.assignment;
/*
 *Write a java program to find continuous sub array whose sum is equal to a given number?
 *Input Array : [42, 15, 12, 8, 6, 32]
 *Input Number : 26
 *Continuous Sub Array : 12 8 6
 *=================================
 *Input Array : [12, 5, 31, 13, 21, 8]
 *Input Number : 49
 *Continuous Sub Array : 5 31 13
 */
public class ContinuousSubarray {
	public static void main(String[] args) {
		
		int[] inputArray = {42, 15, 12, 8, 6, 32};
		int inputNumber = 26;
		findContinuousSubArray(inputArray, inputNumber);
		
		findContinuousSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
		
	}

	private static void findContinuousSubArray(int[] element, int no) {
		
		for (int i = 0; i < element.length - 1; i++) {
			int j=i;
			int sum=0;
			while (sum<no && j<element.length) {
				sum=sum+element[j];
				if(sum==no) {
					System.out.print("\nContinuous Sub Array :");
					for(int start=i; start<=j;start++)
						System.out.print(" "+element[start]);
				}
				j++;
			}
			
		}
	}
}
