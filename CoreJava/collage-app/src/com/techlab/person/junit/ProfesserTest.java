package com.techlab.person.junit;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.techlab.person.Person;
import com.techlab.person.Professer;

public class ProfesserTest {

	@Test
	public void testProfesser() {

//		Arrange
		int expectedId = 101;
		String expectedName = "Sonam";
		String expectedAddress = "Andheri";
		String expectedDateOfBirth = "15/04/1993";
		float expectedBasicSalary = 15000;
		float expectedGrossSalary = 28500;

//		Act
		Professer p = new Professer(101, "Sonam", "Andheri", new Date(93, 3, 15), 15000);

//		Assert
		assertEquals(expectedId, p.getId());
		assertEquals(expectedName, p.getName());
		assertEquals(expectedAddress, p.getAddress());
		assertEquals(expectedDateOfBirth, p.getDateOfBirth());
		assertEquals(expectedBasicSalary, p.getBasicSalary(),0);
		assertEquals(expectedGrossSalary, p.getGrossSalary(),0);
	}
	

}
