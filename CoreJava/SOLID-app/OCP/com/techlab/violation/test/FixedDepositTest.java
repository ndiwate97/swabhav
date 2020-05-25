package com.techlab.violation.test;

import java.io.ObjectInputStream.GetField;

import com.techlab.violation.FestivalType;
import com.techlab.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(123456, "new Account", 5000, 1, FestivalType.DIWALI);
				fd.calculateSimpleInterest();
		printInfo(fd);
	}

	private static void printInfo(FixedDeposit fd) {
		System.out.println("Account details:");
		System.out.println("Account no. : " + fd.getAccNo());
		System.out.println("Account Name : " + fd.getAccName());
		System.out.println("Principle Amount : " + fd.getPrinciple());
		System.out.println("Tenure (in years) : " + fd.getYear());
		System.out.println("Festival Type : " + fd.getFestival());
		System.out.println("Simple Interest Amount : "+fd.getAmount());
	}

}
