package com.techlab.invoice.test;

import com.techlab.invoice.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i = new Invoice(101, "object1", 100, 20);
		printInformation(i);
		Invoice i1 = new Invoice();
		printInformation(i1);

	}
	
	private static void printInformation(Invoice i) {
		System.out.println("\nID : " + i.getID());
		System.out.println("Name : " + i.getName());
		System.out.println("Amount of Product : " + i.getAmount());
		System.out.println("Discount on Product : " + i.getDiscountPrecentage() + "%");

		System.out.println("Amount to be paid : " + i
				.calculateTotalCost( i.calculateGST())		);

	}
	
	
}
