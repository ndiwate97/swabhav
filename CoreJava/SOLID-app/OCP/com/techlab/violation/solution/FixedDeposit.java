package com.techlab.violation.solution;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int year;

	public FixedDeposit(int accNo, String accName, double principle, int year) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.principle = principle;
		this.year = year;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getAmount() {
		return amount;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYear() {
		return year;
	}

	public void calculateSimpleInterest(IFestivalRate fr) {
		double rateOfInterest = fr.getRate();
		amount = principle + (principle * year * rateOfInterest/100);
	}

}
