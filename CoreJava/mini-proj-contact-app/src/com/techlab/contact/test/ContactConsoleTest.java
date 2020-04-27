package com.techlab.contact.test;

import java.io.*;
import java.util.*;
import com.techlab.contact.Contact;
import com.techlab.contact.ContactManager;

public class ContactConsoleTest {

	private final static int ADD = 1;
	private final static int MODIFY = 2;
	private final static int SEARCH = 3;
	private final static int DELETE = 4;
	private final static int DISPLAY = 5;
	private final static int EXIT = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		ContactManager cm = new ContactManager();

		ContactManager.setList(retriveContactList());

		while (choice != 6) {
			System.out.println(
					"\n1. Add to Contact\n2. Modify Contact\n3. Search Contact\n4. Delete Contact\n5. Display Contact List\n6. Exit");
			System.out.println("Enter Your Choice : ");

			choice = sc.nextInt();

			switch (choice) {
			case ADD:
				System.out.println("Enter First name : ");
				String fName = sc.next();
				System.out.println("Enter Last name : ");
				String lName = sc.next();
				System.out.println("Enter Phone No : ");
				long phoneNo = sc.nextLong();
				System.out.println("Enter Email Id : ");
				String emailId = sc.next();
				cm.addToContacts(fName, lName, phoneNo, emailId);
				storeContactList(ContactManager.getList());
				break;

			case MODIFY:
				System.out.println("Enter Full Name of Contact you want to Modify : ");
				fName = sc.next();
				lName = sc.next();

				System.out.println("What do you want to modify?\n1.First Name\n2.Last Name\n3.Phone No.\n4.Email Id");
				choice = sc.nextInt();
				System.out.println("Enter Modification :");
				String modification = sc.next();

				cm.ModifyContactByName(fName, lName, choice, modification);
				storeContactList(ContactManager.getList());
				break;

			case SEARCH:
				System.out.println("Enter the key to search the contact :");
				String searchKey = sc.next();

				cm.searchContactByKey(searchKey);
				break;

			case DELETE:
				displayContactList(ContactManager.getList());
				System.out.println("Enter Full Name of Contact you want to delete : ");
				fName = sc.next();
				lName = sc.next();

				cm.deleteContact(fName, lName);
				storeContactList(ContactManager.getList());
				break;

			case DISPLAY:
				displayContactList(ContactManager.getList());
				break;

			case EXIT:
				System.out.println("Exit Successfully...!");
				sc.close();
				break;

			default:
				System.err.println("Invalid Choice....!");
				break;
			}
		}

	}

	private static void displayContactList(List<Contact> list) {
		System.out.println(list);
	}

	private static void storeContactList(List<Contact> list) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C:\\swabhav\\CoreJava\\mini-proj-contact-app\\src\\ContactDetailFile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(list);
			out.flush();
			out.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static List<Contact> retriveContactList() {
		List<Contact> list = null;
		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("C:\\swabhav\\CoreJava\\mini-proj-contact-app\\src\\ContactDetailFile.txt"));
			
			list = (List<Contact>) in.readObject();
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
