package com.techlab.person.junit;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;

import com.techlab.person.Person;

public class PersonTest {

	@Test
	public void testPerson() {
//		Arrange
		int expectedId = 1;
		String expectedName = "Namrata";
		String expectedAddress = "Ulhasnagar";
		String expectedDateOfBirth = "30/09/1997";

//		Act
		Person p = new Person(1, "Namrata", "Ulhasnagar", new Date(97, 8, 30));
				
//		Assert
		assertEquals(expectedId, p.getId());
		assertEquals(expectedName, p.getName());
		assertEquals(expectedAddress, p.getAddress());
		assertEquals(expectedDateOfBirth, p.getDateOfBirth());
		}

}
