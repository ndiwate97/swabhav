package com.techlab.account;

import java.util.Date;

public class AccountProxy extends Account {

	public AccountProxy(String accountNo, String accountName, double balance) {
		super(accountNo, accountName, balance);
	}

	@Override
	public void deposit(int amount) throws InterruptedException {
		
		System.out.println("Before Depositing date time: "+ new Date());
		System.out.println("Balance before depositing :"+ getBalance());
		super.deposit(amount);
		System.out.println("Balance after depositing :"+ getBalance());
		System.out.println("After Depositing date time: " + new Date());
	}
}
