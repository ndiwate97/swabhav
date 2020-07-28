package com.techlab.account.test;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = new Account(123456, "new Account", 1000);
		acc1.withdraw(200);
		acc1.deposit(500);
		
		Account acc2 = new Account(987462, "new Account", 1550);
		acc2.deposit(500);
		acc2.withdraw(1000);
		
		}
}
