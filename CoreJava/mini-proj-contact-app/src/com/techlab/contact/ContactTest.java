package com.techlab.contact;

import static org.junit.Assert.*;

import org.junit.Test;


public class ContactTest {

	@Test
	public void testContact() {

		// Arrange
		String expectedFname = "Namrata";
		String expectedLname = "Diwate";
		long expectedPhoneNo = 7894561230l;
		String expectedEmail = "ndiwate@gmail.com";

		// Act
		Contact c = new Contact("Namrata", "Diwate", 7894561230l, "ndiwate@gmail.com");

		// Assert
		assertEquals(expectedFname, c.getfName());
		assertEquals(expectedLname, c.getlName());
		assertEquals(expectedPhoneNo, c.getPhoneNo());
		assertEquals(expectedEmail, c.getEmailId());
		
	}

}
