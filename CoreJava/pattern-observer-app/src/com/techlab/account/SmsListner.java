package com.techlab.account;

import java.util.Date;

public class SmsListner implements IListner {

	@Override
	public void update(String transaction, int amount, int accountNo,  Date date) {
		
		System.out.println("This is an SMS:");
		System.out.println(transaction + " has performed on account no : " + accountNo + ", of Rs." + amount+" on "+date);
		
	}

}
