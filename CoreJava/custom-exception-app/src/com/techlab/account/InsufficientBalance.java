package com.techlab.account;

public class InsufficientBalance extends Exception{
	public InsufficientBalance(String str){
		super(str);
	}
}
