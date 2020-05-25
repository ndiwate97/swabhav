package com.techlab.shopping;

public class Product {

	private int prodId;
	private String prodName;
	private double cost;

	public Product(int prodId, String prodName, double cost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.cost = cost;
	}

	public int getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public double getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "\n\t\t  Product Id = " + prodId + ", Product Name = " + prodName + ", Cost = " + cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + prodId;
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (prodId != other.prodId)
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		return true;
	}
	
	

}
