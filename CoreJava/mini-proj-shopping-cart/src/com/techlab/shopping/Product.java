package com.techlab.shopping;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1489515248866328511L;
	private int prodId;
	private String prodName;
	private int unitPrice;
	private int quantity;
	private int discountPercent;
	private float total;
	

//	constructor

	public Product(int prodId, String prodName, int unitPrice, int discountPercent, int quantity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.discountPercent = discountPercent;
		getTotal();
	}

	@Override
	public String toString() {
		return "\nProduct ID = " + prodId + ", Product Name = " + prodName + ", Unit Price =" + unitPrice
				+ ", Quantity = " + quantity + ", Discount Given = " + discountPercent + "%";
	}

	// getters
	public int getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getDiscountPercentage() {
		return discountPercent;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getTotal() {
		float discount = ((quantity * unitPrice) * (discountPercent / 100));
		total = (quantity * unitPrice) - discount;
		return total;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
