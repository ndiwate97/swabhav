package com.techlab.database.classes;

import com.techlab.icrud.Icrudable;

public class InvoiceDB implements Icrudable {

	@Override
	public void Create() {
		System.out.println("Creating Invoice Database...!");
	}

	@Override
	public void Read() {
		System.out.println("Reading Invoice Database...!");
	}

	@Override
	public void Update() {
		System.out.println("Updating Invoice Database...!");
	}

	@Override
	public void Delete() {
		System.out.println("Deleting Invoice Database...!");
	}

}
