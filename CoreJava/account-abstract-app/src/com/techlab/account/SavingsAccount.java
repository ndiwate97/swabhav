package com.techlab.account;

public class SavingsAccount extends Account {
	
	private final int MINIMUM_BALANCE=500;
	
	public SavingsAccount(int accNo, String accountName, double balance) {
		super(accNo, accountName, balance);
	}

	@Override
	public void withdraw(int amount) {
		if ((balance - amount) >= MINIMUM_BALANCE) {
			balance = balance - amount;
			transactionStatus = true;
		} else {
			transactionStatus = false;
		}
	}

	
}
