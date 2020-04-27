package com.techlab.lineitem;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;

	public LineItem(int id, String name, double unitPrice, int quantity) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public double calculateTotal() {
		return unitPrice*quantity;
	}
	
}
