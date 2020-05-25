package com.techlab.shopping;

import java.util.*;

public class Order {
	
	private int orderId;
	private List<LineItems> lineItemList = new ArrayList<LineItems>();
	private Date orderDate;
	
	public Order(int orderId, Date orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public List getLineItemList() {
		return lineItemList;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void addLineItems(LineItems newListItem) {
		boolean isadded=false;
		for (Iterator iterator = lineItemList.iterator(); iterator.hasNext();) {
			LineItems currentListItem = (LineItems) iterator.next();
			if(currentListItem.getP().equals(newListItem.getP())) {
				currentListItem.setQuantity(currentListItem.getQuantity()+newListItem.getQuantity());
				isadded=true;
			}
		}
		if(!isadded)
				lineItemList.add(newListItem);
		
	}

	@Override
	public String toString() {
		return "\nOrder : Order Id =" + orderId + ", Date = " + orderDate + ",\n\t Line Item List : " + lineItemList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineItemList == null) ? 0 : lineItemList.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + orderId;
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
		Order other = (Order) obj;
		if (lineItemList == null) {
			if (other.lineItemList != null)
				return false;
		} else if (!lineItemList.equals(other.lineItemList))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	
}
