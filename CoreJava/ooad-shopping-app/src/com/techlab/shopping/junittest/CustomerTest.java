package com.techlab.shopping.junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItems;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;

public class CustomerTest {

	@Test
	public void testCustomer() {
		
		// Arrange
		int expectedCustId = 101;
		String expectedCustName = "Customer";
		String expectedCustAddress = "Mumbai";

		// Act
		Customer c = new Customer(101, "Customer", "Mumbai" );

		// Assert
		assertEquals(expectedCustId, c.getCustId());
		assertEquals(expectedCustName, c.getCustName());
		assertEquals(expectedCustAddress, c.getCustAddress());
	}

	@Test
	public void testAddOrder() {
		// Arrange
		List<Order> expectedorders = new ArrayList<Order>();
		expectedorders.add(new Order(301, new Date(20, 06, 10)));	
		// Act
		Customer c = new Customer(101, "Customer", "Mumbai" );
		Order o1 = new Order(301, new Date(20, 06, 10));
		c.addOrder(o1);
		
		//Assert
		assertEquals(expectedorders, c.getOrders());
//		assertTrue(expectedorders.equals(c.getOrders()));-
	}

}
