package com.techlab.customer.test;

import com.techlab.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c1 = new Customer("abc",10);
		
		Customer c2 = new Customer("pqr",20);

		Customer c3 = new Customer("xyz",30);		
		
		System.out.println(c1.getId());//C1001
		System.out.println(c2.getId());//C1002
		System.out.println(c3.getId());//C1003
	}

		
	}