package com.techlab.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fName;
	private String lName;
	private long phoneNo;
	private String emailId;

	// constructor
	public Contact(String fName, String lName, long phoneNo, String emailId) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	// getters
	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "\nName=" + fName + " " + lName + ", Phone No=" + phoneNo + ", Email Id=" + emailId;
	}
}
