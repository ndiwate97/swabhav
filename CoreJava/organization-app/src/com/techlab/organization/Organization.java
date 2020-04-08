package com.techlab.organization;

import java.util.Arrays;

public class Organization {

	private int id;
	private String name;
	private String[] partners = new String[3];
	private String address;
	private static int count = 0;

	public Organization(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void addPartner(String partner) {
		partners[count] =partner;
		count++;
	}
	
	
	public String getPartner() {
		return  Arrays.toString(partners);
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getCount() {
		return count;
	}

}
