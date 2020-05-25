package com.techlab.person;

import java.text.*;
import java.util.Date;

public class Person {

	protected int id;
	protected String name;
	protected String address;
	protected Date dateOfBirth;

//	constructor
	public Person(int id, String name, String address, Date dateOfBirth) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

//	getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getDateOfBirth() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(dateOfBirth);
	}

}
