package com.techlab.assignment;
/*
 * Write a java program to separate zeros from non-zeros in an integer array? 
 * Input Array : [12, 0, 7, 0, 8, 0, 3] 
 * Input Array After moving zeros to end : [12, 7, 8, 3, 0, 0, 0]
 * ====================================== 
 * Input Array : [1, -5, 0, 0, 8, 0, 1] 
 * Input Array After moving zeros to end : [1, -5, 8, 1, 0, 0, 0]
 */

public class ZerosNonZeros {

	public static void main(String[] args) {
		
		int inputArray[] = {12, 0, 7, 0, 8, 0, 3};
		
		seperateZerosAndNonZeros(inputArray);
		
		seperateZerosAndNonZeros(new int[] {1, -5, 0, 0, 8, 0, 1});
		
	}

	private static void seperateZerosAndNonZeros(int[] inputArray) {
		int pos = 0;
	      for(int i=0; i<inputArray.length; i++){
	         if(inputArray[i]!=0){
	            inputArray[pos]=inputArray[i];
	            pos++;
	         }
	      }
	      while(pos<inputArray.length) {
	         inputArray[pos] = 0;
	         pos++;
	      }
	      
	      System.out.print("\nInput Array After moving zeros to end :");
	      for(int i=0; i<inputArray.length;i++)
				System.out.print(" "+inputArray[i]);
	}

}
