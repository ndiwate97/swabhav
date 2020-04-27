package com.techlab.database.classes.test;

import com.techlab.database.classes.*;
import com.techlab.icrud.Icrudable;

public class CrudTest {
	public static void main(String[] args) {
		AddressDB a = new AddressDB();
		doDbOperations(a);
		
		System.out.println();
		CustomerDB c = new CustomerDB();
		doDbOperations(c);
		
		System.out.println();
		InvoiceDB i = new InvoiceDB();
		doDbOperations(i);
	}

	private static void doDbOperations(Icrudable crud) {
		crud.Create();
		crud.Read();
		crud.Update();
		crud.Delete();
	}
}
