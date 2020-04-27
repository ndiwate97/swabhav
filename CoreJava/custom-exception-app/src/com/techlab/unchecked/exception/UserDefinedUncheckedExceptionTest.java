package com.techlab.unchecked.exception;

import java.util.Scanner;

public class UserDefinedUncheckedExceptionTest {

	
	private static final int MAXLIMIT = 10;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no between 0 to 10 :");
		int number = sc.nextInt();
		
		try {
			if (number>MAXLIMIT) {
				throw new UserDefinedUncheckedException("Number Cross the Limit...");
			}
			else {
				System.out.println("No within the limit..");
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
