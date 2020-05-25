package com.techlab.shopping.junittest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.techlab.shopping.LineItems;
import com.techlab.shopping.Product;

public class LineItemsTest {

	@Test
	public void testLineItems() {

		// Arrange
		int expectedLineItemId = 1;
		int expectedQuantity = 5;
		Product expectedP = new Product(101, "Apple", 10);

		// Act
		LineItems l = new LineItems(1, 5, new Product(101, "Apple", 10));

		// Assert
		assertEquals(expectedLineItemId, l.getLineItemId());
		assertEquals(expectedQuantity, l.getQuantity());
		assertEquals(expectedP, l.getP());
//		assertTrue(expectedP.equals(l.getP()));
//		assertSame(expectedP, l.getP());
	}

//	@Test
//	public void testCalulateTotalCartPrice() {
//		fail("Not yet implemented");
//	}

}
