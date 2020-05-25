package com.techlab.shopping.test;

import java.util.Date;

import com.techlab.shopping.*;

public class ShoppingTest {
	
	public static void main(String[] args) {
		
		Product apple =  new Product(101, "Apple", 10);
		Product mango =  new Product(102, "Mango", 5);
		Product banana =  new Product(103, "Banana", 4);
		Product orange =  new Product(104, "Orange", 6);
				
		Customer c = new Customer(101, "Customer 1", "Mumbai" );
		
		Order o1 = new Order(301, new Date());
		o1.addLineItems(new LineItems(1, 10 , apple));
		o1.addLineItems(new LineItems(2, 10, mango));
		o1.addLineItems(new LineItems(3, 5, apple));
		c.addOrder(o1);
		
		Order o2 = new Order(302, new Date(20, 06, 10));
		o2.addLineItems(new LineItems(1, 20, banana));
		o2.addLineItems(new LineItems(2, 20, orange));
		c.addOrder(o2);
		
		printAllDetails(c);
		
		c.searchOrder(301);
		
		c.removeOrder(301);
		
		printAllDetails(c);
		
	}

	private static void printAllDetails(Customer c) {
		
		System.out.println(c.getCustId()+"\n"+c.getCustName()+"\n"+c.getCustAddress());
		System.out.println(c.getOrders());
	}



}
