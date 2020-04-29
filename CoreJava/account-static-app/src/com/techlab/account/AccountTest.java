package com.techlab.account;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.*;

public class AccountTest {

	@Before
	public void beforeTest() {
		System.out.println("Inside Before.");
	}

	@Test
	public void testAccountConstructorWithThreeParameter() {

		System.out.println("Inside 3 param.");

		// Arrange
		String expectedaccno = "101";
		String expectedaccnanme = "Sonam";
		double expectedaccbalance = 16000;

		// Act
		Account acc = new Account("101", "Sonam", 16000);

		// Assert
		assertEquals(expectedaccno, acc.getAccountNo());
		assertEquals(expectedaccnanme, acc.getAccountName());
		assertEquals(expectedaccbalance, acc.getBalance(), 0);
	}

	@Test
	public void testAccountConstructorWithTwoParameter() {

		System.out.println("Inside 2 param.");

		// Arrange
		String expectedaccnanme = "Namrata";
		double expectedaccbalance = 15000;

		// Act
		Account acc = new Account("Namrata", 15000);

		// Assert
		assertEquals(expectedaccnanme, acc.getAccountName());
		assertEquals(expectedaccbalance, acc.getBalance(), 0);
	}

	@Test
	public void testDeposit() {
		// Arrange
		double expectedaccbalance = 15500;
		// Act
		Account acc = new Account("Namrata", 15000);
		acc.deposit(500);

		// Assert
		assertEquals(expectedaccbalance, acc.getBalance(), 0);
	}

	@Test
	public void testWithdraw() {
		// Arrange
		double expectedaccbalance = 15000;
		// Act
		Account acc = new Account("Namrata", 15000);
		acc.withdraw(15000);

		// Assert
		assertEquals(expectedaccbalance, acc.getBalance(), 0);
	}

	@After
	public void afterTest() {
		System.out.println("Inside After.");
	}

}
