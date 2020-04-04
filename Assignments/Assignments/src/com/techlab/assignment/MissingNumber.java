package com.techlab.assignment;
/*
 * java program to find a missing number in an integer array? 
 * Input Array : [1, 4, 5, 3, 2, 8, 6] 
 * Missing Number is = 7
 */
public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] InputArray = {1, 4, 5, 3, 2, 8, 6};
		
		findMissingNo(InputArray);
		
	}

	private static void findMissingNo(int inputArray[]) {
		
	    int total = (inputArray.length + 1) * (inputArray.length + 2) / 2; 
	    for (int i = 0; i < inputArray.length; i++) 
	        total -= inputArray[i]; 
	    System.out.println("Missing Number is = "+total); 
	    
	} 
}
