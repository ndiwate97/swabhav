package com.techlab.violation.solution;

public class InvoicePrinter {
	
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInfo() {
		
		invoice.calculateDiscountAmount();
		invoice.calculateGSTAmount();

		System.out.println("Invoice ID : " + invoice.getId());
		System.out.println("Name : " + invoice.getName());
		System.out.println("Amount : "+ invoice.getAmount());
		
	}

}
