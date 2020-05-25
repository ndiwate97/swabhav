package com.techlab.shopping.junittest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.techlab.shopping.Product;

public class ProductTest {

	@Test
	public void testProduct() {

		// Arrange
		int expectedProdId = 101;
		String expectedProdName = "Apple";
		double expectedCost = 10;

		// Act
		Product apple =  new Product(101, "Apple", 10);

		// Assert
		assertEquals(expectedProdId, apple.getProdId());
		assertEquals(expectedProdName, apple.getProdName());
		assertEquals(expectedCost,apple.getCost(),0);

	}

}
