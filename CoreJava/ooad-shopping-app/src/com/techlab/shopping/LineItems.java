package com.techlab.shopping;

public class LineItems {
	
	private int lineItemId;
	private int quantity;
	private Product p;
	
	public LineItems(int lineItemId, int quantity, Product p) {
		this.lineItemId = lineItemId;
		this.quantity = quantity;
		this.p = p;
	}

	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getLineItemId() {
		return lineItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getP() {
		return p;
	}
	
	public double calulateTotalCartPrice() {
		
		double totalCartPrice = p.getCost()*quantity;
		
		return totalCartPrice;
		
	}

	@Override
	public String toString() {
		return "\n\t\tLine item Id=" + lineItemId +  ", Products :" + p +", Quantity=" + quantity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lineItemId;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + quantity;
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
		LineItems other = (LineItems) obj;
		if (lineItemId != other.lineItemId)
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

}
