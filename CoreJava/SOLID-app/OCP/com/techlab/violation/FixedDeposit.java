package com.techlab.violation;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int year;
	private FestivalType festival;

	public FixedDeposit(int accNo, String accName, double principle, int year, FestivalType festival) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.principle = principle;
		this.year = year;
		this.festival = festival;
	}

	public FestivalType getFestival() {
		return festival;
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

	public void calculateSimpleInterest() {

		int rateOfInterest;
		if (festival.equals(FestivalType.NORMAL)) {
			rateOfInterest = 15;
		} else
			rateOfInterest = 10;
		amount = principle + (principle * year * rateOfInterest/100);

	}

}
