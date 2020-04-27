package com.techlab.database.classes;

import com.techlab.icrud.Icrudable;

public class AddressDB implements Icrudable {

	@Override
	public void Create() {
		System.out.println("Creating Address Database...!");
	}

	@Override
	public void Read() {
		System.out.println("Reading Address Database...!");
	}

	@Override
	public void Update() {
		System.out.println("Updating Address Database...!");
	}

	@Override
	public void Delete() {
		System.out.println("Deleting Address Database...!");
	}

}
