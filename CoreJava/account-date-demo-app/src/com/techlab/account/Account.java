package com.techlab.account;

import java.time.LocalDate;
import java.util.Date;

public class Account {
	private static int autoNo = 1001;
	private String accNo;//(autocreated as SBI1001)
	private String accName;
	private double balance;
	private Date creationDate;
	private LocalDate dateOfBirth;
	
	public Account(String accName, double balance, Date creationDate, LocalDate dateOfBirth) {
		accNo = "SBI" + autoNo;
		this.accName = accName;
		this.balance = balance;
		this.creationDate = creationDate;
		this.dateOfBirth = dateOfBirth;
		autoNo++;
	}

	public String getAccno() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	
}
