package com.techlab.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

	private int accountNo;
	private String accountName;
	private double balance;

	List<IListner> listners = new ArrayList<IListner>();

	public Account(int accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
		
		addListners();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		if ((balance - amount) >= 500) {
			balance = balance - amount;
			
			notifyListners("withdraw", amount,new Date());
		}

	}

	public void deposit(int amount) {
		balance = balance + amount;
		notifyListners("deposit",amount,new Date());
	}

	public void addListners() {
		listners.add(new EmailListner());
		listners.add(new SmsListner());
	}
	
	public void notifyListners (String transaction, int amount, Date date) {
		for (IListner listner : listners) {
			listner.update(transaction,amount,accountNo, date);
		}
	}
}
