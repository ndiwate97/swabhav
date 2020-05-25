package com.techlab.shopping.junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.techlab.shopping.LineItems;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;

public class OrderTest {

	@Test
	public void testOrder() {

		// Arrange
		int expectedOrderId = 301;
		Date expectedorderDate = new Date(20, 06, 10);
		
		// Act
		Order o = new Order(301, new Date(20, 06, 10));
		
		// Assert
		assertEquals(expectedOrderId, o.getOrderId());
		assertEquals(expectedorderDate, o.getOrderDate());
		
	}

	@Test
	public void testAddLineItems() {
		
		// Arrange
		List<LineItems> expectedLineItemList = new ArrayList<LineItems>();
		expectedLineItemList.add(new LineItems(1, 15, new Product(101, "Apple", 10)));
		
		// Act
		Order o = new Order(301, new Date(20, 06, 10));
		o.addLineItems( new LineItems(1, 5, new Product(101, "Apple", 10)));
		o.addLineItems( new LineItems(1, 10, new Product(101, "Apple", 10)));
		
		// Assert
		assertEquals(expectedLineItemList, o.getLineItemList());
		
	}

}
