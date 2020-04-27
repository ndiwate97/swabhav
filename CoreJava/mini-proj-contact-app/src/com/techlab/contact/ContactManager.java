package com.techlab.contact;

import java.io.*;
import java.util.*;
import com.techlab.contact.Contact;

public class ContactManager {
	
	private static final int FIRSTNAME = 1;
	private static final int LASTNAME = 2;
	private static final int PHONENO = 3;
	private static final int EMAIL = 4;
	
	private static List<Contact> list = new ArrayList<Contact>();
	
	
	public static List<Contact> getList() {
		return list;
	}
	
	public static void setList(List<Contact> list) {
		ContactManager.list = list;
	}
	
	public void addToContacts(String fName, String lName, long phoneNo, String emailId) {

		Contact c = new Contact(fName, lName, phoneNo, emailId);
		list.add(c);
	}

	
	public void ModifyContactByName(String fName, String lName, int choice, String modification) {
		boolean isContactFound = false;
		for (Contact c : list) {
			if (c.getfName().equalsIgnoreCase(fName) && c.getlName().equalsIgnoreCase(lName)) {
				isContactFound = true;

				String newFName = c.getfName();
				String newLName = c.getlName();
				long phoneNo = c.getPhoneNo();
				String email = c.getEmailId();

				switch (choice) {
				case FIRSTNAME:
					newFName = modification;

					if (fName.equals(modification)) {
						System.err.println("No changes to make...");
					} else {
						deleteContact(fName, lName);
						addToContacts(newFName, newLName, phoneNo, email);

					}

					break;
				case LASTNAME:
					newLName = modification;

					if (lName.equals(modification)) {
						System.err.println("No changes to make...");
					} else {
						deleteContact(fName, lName);
						addToContacts(newFName, newLName, phoneNo, email);
					}

					break;
				case PHONENO:

					phoneNo = Long.parseLong(modification);

					if (c.getPhoneNo() == phoneNo) {
						System.err.println("No changes to make...");
					} else {
						deleteContact(fName, lName);
						addToContacts(newFName, newLName, phoneNo, email);
					}
					break;
				case EMAIL:

					email = modification;

					if (c.getEmailId().equals(modification)) {
						System.err.println("No changes to make...");
					} else {
						deleteContact(fName, lName);
						addToContacts(newFName, newLName, phoneNo, email);
					}
					break;
				}
			}

		}
		if (!isContactFound)
			System.err.println("Contact not Found...");

	}

	public void searchContactByKey(String searchKey) {

		boolean isContactFound = false;
		for (Contact c : list) {
			if (c.getfName().equalsIgnoreCase(searchKey) || c.getlName().equalsIgnoreCase(searchKey)
					|| c.getEmailId().equalsIgnoreCase(searchKey)) {
				System.out.println("Name=" + c.getfName() + " " + c.getlName() + ", Phone No=" + c.getPhoneNo()
						+ ", Email Id=" + c.getEmailId());
				isContactFound = true;
			}
		}
		if (!isContactFound)
			System.err.println("Contact not Found...");
	}

	public void deleteContact(String fName, String lName) {
		int i = 0;
		int index = list.size() + 1;
		for (Contact c : list) {
			if (c.getfName().equalsIgnoreCase(fName) && c.getlName().equalsIgnoreCase(lName)) {
				index = i;
			}
			i++;
		}
		if (index < list.size())
			list.remove(index);
		else
			System.err.println("Contact not Found...");

	}
}