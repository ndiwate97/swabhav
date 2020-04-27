package com.techlab.account;

public abstract class Account {
	private int accNo;
	private String accountName;
	protected double balance;
	protected boolean transactionStatus = true;

	public Account(int accNo, String accountName, double balance) {
		this.accNo = accNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	// getters
	public int getAccNo() {
		return accNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public boolean getTransactionStatus() {
		return transactionStatus;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public abstract void withdraw(int amount);

}
