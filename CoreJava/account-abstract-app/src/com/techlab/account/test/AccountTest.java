package com.techlab.account.test;

import java.io.*;
import com.techlab.account.*;

public class AccountTest {
	static boolean withdrawStatus;
	public static void main(String[] args) {

		SavingsAccount a1 = new SavingsAccount(41257,"Account1", 1500);
		printAccountInfo(a1);
		a1.deposit(1000);
		printTransactionInfo(a1);
		a1.withdraw(2000);
		printTransactionInfo(a1);
		
		
		CurrentAccount a2 = new CurrentAccount(14789,"Account2", 1500);

		a2.deposit(1000);
		printTransactionInfo(a2);
		a2.withdraw(2000);
		printTransactionInfo(a2);


	}
	private static void printAccountInfo(SavingsAccount a) {
		System.out.println("\nAccount No : "+a.getAccNo());
		System.out.println("Account Holder Name : "+a.getAccountName());
		System.out.println("Current Balance : " + a.getBalance());
	}
	private static void printTransactionInfo(Account a) {
		if (!a.getTransactionStatus()) {
			System.err.println("\nYou don't have sufficient balance to Withdraw");
			System.out.println("Current Balance : " + a.getBalance());
		} else
			System.out.println("\nTransaction Sucessfull\nCurrent Balance : " + a.getBalance());

	}

	
}
