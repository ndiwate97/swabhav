package com.techlab.violation;

public class Invoice {

	private int id;
	private String name;
	private double amount;
	private float discountPercentage;
	private float GSTPercentage;

	public Invoice(int id, String name, double amount, float discountPercentage, float gSTPercentage) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
		GSTPercentage = gSTPercentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public float getGSTPercentage() {
		return GSTPercentage;
	}

	public void calculateGSTAmount() {
		amount = amount + (amount / (100f * GSTPercentage));
	}

	public void calculateDiscountAmount() {
		amount = amount + (amount / (100f * discountPercentage));
	}

	public void printInfo() {

		System.out.println("Invoice ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Amount : "+ amount);
		
	}

}
