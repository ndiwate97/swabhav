package com.techlab.shopping;

import java.util.*;

public class Customer {

	private int custId;
	private String custName;
	private String custAddress;
	private List<Order> orders = new ArrayList<Order>();

	public Customer(int custId, String custName, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	
	public void addOrder(Order o) {
		orders.add(o);	
	}
	
	public void searchOrder(int orderId) {
		int i=0;
		int index = orders.size();
		for (Order order : orders) {
			if(order.getOrderId()==orderId) {
				index = i;
			}
		}
		if(index<orders.size()) {
			System.out.println("\nOrder You are Searching for :");
			System.out.println(orders.get(index));
		}
		
	}

	public void removeOrder(int orderId) {
		for (Iterator iterator = orders.iterator(); iterator.hasNext();) {
			Order o = (Order) iterator.next();
			if (o.getOrderId()==orderId)
				iterator.remove();
		}
	}
	

}
