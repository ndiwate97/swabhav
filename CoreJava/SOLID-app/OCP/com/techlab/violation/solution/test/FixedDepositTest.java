package com.techlab.violation.solution.test;


import com.techlab.violation.solution.*;

public class FixedDepositTest {

	public static void main(String[] args) {
		IFestivalRate fr = new HoliRate();
		FixedDeposit fd = new FixedDeposit(123456, "new Account", 5000, 1);
				fd.calculateSimpleInterest(fr);
		printInfo(fd,fr);
	}

	private static void printInfo(FixedDeposit fd, IFestivalRate fr) {
		System.out.println("Account details:");
		System.out.println("Account no. : " + fd.getAccNo());
		System.out.println("Account Name : " + fd.getAccName());
		System.out.println("Principle Amount : " + fd.getPrinciple());
		System.out.println("Tenure (in years) : " + fd.getYear());
		System.out.println("Rate of Interest: " + fr.getRate() );
		System.out.println("Simple Interest Amount : "+fd.getAmount());
	}

}
