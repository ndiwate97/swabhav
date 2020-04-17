package com.techlab.account.test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import com.techlab.account.Account;

public class AccountTest {
	public static void main(String[] args) {

		Account[] accounts = new Account[4];

		accounts[0] = new Account("1st Account", 1000, new Date(), LocalDate.of(1997, 12, 30));
		accounts[1] = new Account("2nd Account", 1500, new Date(), LocalDate.of(1999, 1, 16));
		accounts[2] = new Account("3rd Account", 2000, new Date(), LocalDate.of(1972, 9, 10));
		accounts[3] = new Account("4th Account", 1050, new Date(), LocalDate.of(1982, 6, 19));

		Account richAccountHolder = findRichAccountHolder(accounts);

		Account youngAccountHolder = findYoungAccountHolder(accounts);

		System.out.println("\nInformation of Rich Account Holder");
		printInfo(richAccountHolder);

		System.out.println("\nInformation of Young Account Holder");
		printInfo(youngAccountHolder);

	}

	private static Account findRichAccountHolder(Account[] accounts) {
		double maxBalance = accounts[0].getBalance();
		int index = 0;
		for (int i = 1; i < accounts.length; i++) {
			if (maxBalance < accounts[i].getBalance()) {
				maxBalance = accounts[i].getBalance();
				index = i;
			}

		}

		return accounts[index];
	}

	private static Account findYoungAccountHolder(Account[] accounts) {
		int index = 0;
		int youngAge = 0;
		for (int i = 0; i < accounts.length; i++) {
			Period diff = Period.between(accounts[i].getDateOfBirth(), LocalDate.now());
			
			if (diff.getYears() < youngAge && youngAge!=0) {
				youngAge = diff.getYears();
				index = i;
			}
			else if ( youngAge==0){
				youngAge = diff.getYears();
			}

		}

		return accounts[index];
	}

	private static void printInfo(Account a) {
		System.out.println("Account no : " + a.getAccno());
		System.out.println("Account name : " + a.getAccName());
		System.out.println("Balance : " + a.getBalance());
		System.out.println("Creation Date : " + a.getCreationDate());
		System.out.println("Date Of Birth no : " + a.getDateOfBirth());
	}

}
