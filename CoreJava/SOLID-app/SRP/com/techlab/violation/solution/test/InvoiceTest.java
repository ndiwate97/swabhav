package com.techlab.violation.solution.test;

import com.techlab.violation.solution.*;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i = new Invoice(101, "Invoice", 500, 20, 12);
		
		InvoicePrinter printer = new InvoicePrinter(i);
		
		printer.printInfo();
	}
}
