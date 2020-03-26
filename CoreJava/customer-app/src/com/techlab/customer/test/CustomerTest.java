package com.techlab.customer.test;

import com.techlab.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c0 = new Customer();
		c0.setId(1002);
		c0.setName("small");
		c0.setAge(20);
		c0.setEmail("name1.gmail.com");
		c0.setAddress("address of name1");
		
		Customer c1 = new Customer();
		c1.setId(1002);
		c1.setName("medium");
		c1.setAge(22);
		c1.setEmail("name2.gmail.com");
		c1.setAddress("address of name2");

		Customer c2 = new Customer();
		c2.setId(1002);
		c2.setName("large");
		c2.setAge(25);
		c2.setEmail("name3.gmail.com");
		c2.setAddress("address of name3");
		
		
		System.out.println("Elder person is " + c0.whoIsElder(c1,c2));
	}
		
	}


/*
 * learn about constructors its types and this keyword.
 */
	


