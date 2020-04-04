package com.techlab.customer;

public class Customer {

	
	private static int idNo =1001;
	private String id;
	private String name;
	private int order;

	public Customer( String name, int order) {
		this.id = "C"+idNo;
		this.name = name;
		this.order = order;
		idNo++;
	}

	// getters

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOrder() {
		return order;
	}

	// other function
}