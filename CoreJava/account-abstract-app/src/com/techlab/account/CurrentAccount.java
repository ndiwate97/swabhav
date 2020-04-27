package com.techlab.account;

public class CurrentAccount extends Account {

	private final int MINIMUM_BALANCE = 1000;

	public CurrentAccount(int accNo, String accountName, double balance) {
		super(accNo, accountName, balance);
		// TODO Auto-generated constructor stub
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
