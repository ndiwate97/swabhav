package com.techlab.account.test;

import com.techlab.account.AccountProxy;

public class AccountTest {
	
	public static void main(String[] args) throws InterruptedException {
		AccountProxy a = new AccountProxy("NEW100001", "NewAccount", 1500);
		
		a.deposit(500);
	}

}
