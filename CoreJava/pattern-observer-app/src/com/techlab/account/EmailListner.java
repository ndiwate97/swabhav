package com.techlab.account;

import java.util.Date;

public class EmailListner implements IListner {

	@Override
	public void update(String transaction, int amount, int accountNo,  Date date) {
		
		System.out.println("\nThis is an email:");
		System.out.println(transaction + " has performed on account no : " + accountNo + ", of Rs." + amount+" on "+date);
		
	}

}
