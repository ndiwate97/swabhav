package com.techlab.database.classes;

import com.techlab.icrud.Icrudable;

public class CustomerDB implements Icrudable {

	@Override
	public void Create() {
		System.out.println("Creating Customer Database...!");
	}

	@Override
	public void Read() {
		System.out.println("Reading Customer Database...!");
	}

	@Override
	public void Update() {
		System.out.println("Updating Customer Database...!");
	}

	@Override
	public void Delete() {
		System.out.println("Deleting Customer Database...!");
	}

}
