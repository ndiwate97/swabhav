package com.techlab.dry;
/*
 * DRY stands for Don’t Repeat Yourself
 * Its aimed is reduce repetition of information
 * To achive DRY:
 * -Divide the code and logic into smaller reusable units
 * 	and use that code by calling it where needed.
 * Dont repeat yourself(DRY):-
 * 1. dont just copy paste your code .....reduce lines of code 
 * 2. dont use magic numbers ----solution----
 *         final keyword with variable public final double MINIMUM_BALANCE=500;
 * 3.Always use meaningful name -----class,method,variable
 */
public class DryExample {
	
	public final static double MINIMUM_BALANCE = 500.0;
	public static double currentBalance = 1000;

	public static void main(String[] args) {
		showBalance();
		debitOperation(100);
		creditOperation(500);
		
	}

	public static void debitOperation(double debitAmount) {
		if(MINIMUM_BALANCE>=500.0) {
			currentBalance -= debitAmount;
			showBalance();
		}
		else
			System.out.println("you dont have minimum balance to perform this operation");
		
		
	}
	
	public static void creditOperation(double creditAmount) {
		currentBalance += creditAmount;
		showBalance();
	}
	
	public static void showBalance() {
		System.out.println("You have Balance of amount "+ currentBalance);
	}
}
