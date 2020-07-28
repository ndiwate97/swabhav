package com.techlab.account;

public class Account {
	private String accountName;
	private double balance;
	private String accountNo;

	public Account(String accountNo, String accountName, double balance) {

		this.accountName = accountName;
		this.balance = balance;
		this.accountNo = accountNo;
	}

	public Account(String accountName, double balance) {
		this.accountName = accountName;
		this.balance = balance;
	}

	public void deposit(int amount) throws InterruptedException {
		Thread.sleep(2000);
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

}