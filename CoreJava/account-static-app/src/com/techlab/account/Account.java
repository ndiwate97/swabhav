package com.techlab.account;

import java.io.Serializable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Account implements Serializable {
	private String accountName;
	private double balance;
	private static int MINIMUM_BALANCE;
	private static int totalNumOfTransaction;
	private int individualNumOfTransaction=0;
	private boolean transactionStatus=true;
	private String accountNo;
	
	static {
		MINIMUM_BALANCE = 500;
		totalNumOfTransaction = 0;
	}

    public Account( String accountNo, String accountName, double balance) {

		this.accountName = accountName;
		this.balance = balance;
		this.accountNo = accountNo;
	}


	public Account(String accountName, double balance) {
    	this.accountName=accountName;
		this.balance=balance;
	}

	
	public void deposit(int amount) {//add
    	balance = balance + amount;
    	addCount();
    	addIndividualCount();
    	transactionStatus=true;
    }

	public void withdraw(int amount) {//reduce
		if((balance-amount)>=500) {
			balance = balance - amount;
			addCount();
			addIndividualCount();
			transactionStatus=true;
		}
		else {
			transactionStatus=false;
		}
	}

	private void addCount() {
		totalNumOfTransaction++;
	}
	private void addIndividualCount() {
		individualNumOfTransaction++;
	}

	public int getMinBal() {
		return MINIMUM_BALANCE;
	}
	
	public static int getCount() {
		return totalNumOfTransaction;	
	}
	public int getIndividualCount() {
		return individualNumOfTransaction;	
	}

	public String getAccountName() {
		return accountName;
	}

	public boolean getTransactionStatus() {
		return transactionStatus;
	}

	public double getBalance() {
		return balance;
	}


	public String getAccountNo() {
		return accountNo;
	}
	
}
	

