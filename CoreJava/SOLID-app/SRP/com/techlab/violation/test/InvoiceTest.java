package com.techlab.violation.test;

import com.techlab.violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i = new Invoice(101, "Invoice", 500, 20, 12);
		
		i.calculateDiscountAmount();
		i.calculateGSTAmount();
		i.printInfo();
	}
}
