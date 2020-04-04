package com.techlab.account;

public class Account {
	private String accountName;
	private double balance;
	private static int MINIMUM_BALANCE;
	private static int totalNumOfTransaction;
	private int individualNumOfTransaction=0;
	private boolean transactionStatus=true;
	
	static {
		MINIMUM_BALANCE = 500;
		totalNumOfTransaction = 0;
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
	
}
