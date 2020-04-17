package com.techlab.account.test;

import java.io.*;
import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account("Account1", 1500);
//		System.out.println(a1.getMinBal());
		a1.withdraw(1400);
		printInfo(a1);

		Account a2 = new Account("Account2", 3500);
		a2.withdraw(1000);
		printInfo(a2);

		Account a3 = new Account("Account3", 4500);
		a3.deposit(1500);
		printInfo(a3);

		Account a4 = new Account("Account4", 4000);
		a4.deposit(500);
		a4.withdraw(2500);
		printInfo(a4);

//		case1: totalNumOfTransaction
		System.out.println("Total no of Transaction in system:" + Account.getCount());

//		case 3: if withdraw amount is <500 , give error msg as "you dont have sufficient balance".

//		case 4: if amount is >=500 , then you have to show remaining balance.

		storingAccountDetails(a1);

		Account retriveAccount = retriveAccountDetails(a1);
		System.err.println("\nretriveAccount:");
		printInfo(retriveAccount);

	}

	private static void printInfo(Account a) {
//		case 2: totalNumOfTransaction by each object
		System.out.println("\nTotal no of Transaction done by " + a.getAccountName() + " : " + a.getIndividualCount());
		if (!a.getTransactionStatus()) {
			System.err.println("You don't have sufficient balance");
			System.out.println("Current Balance : " + a.getBalance());
		} else
			System.out.println("Current Balance : " + a.getBalance());

	}

	private static void storingAccountDetails(Account a) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C:\\swabhav\\CoreJava\\account-static-app\\src\\AccountDetailFile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(a);
			out.flush();
			// closing the stream
			out.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static Account retriveAccountDetails(Account retriveAccount) {
		try {

			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("C:\\swabhav\\CoreJava\\account-static-app\\src\\AccountDetailFile.txt"));
			retriveAccount = (Account) in.readObject();
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return retriveAccount;
	}

}
