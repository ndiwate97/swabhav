package com.techlab.contact;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test; 
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactManagerTest {

	@Test
	public void testSetList() {
		// Arrange
		List<Contact> expectedList = new ArrayList<Contact>();
		expectedList.add(new Contact("Namrata", "Diwate", 7894561230l, "ndiwate@gmail.com"));

		// Act
		List<Contact> list = new ArrayList<Contact>();
		list.add(new Contact("Namrata", "Diwate", 7894561230l, "ndiwate@gmail.com"));
		ContactManager.setList(list);
		List<Contact> actualList = ContactManager.getList();

		// Assert
		assertEquals(actualList,expectedList );
		
		}
	/*
	@Test
	public void testAddToContacts() {
		// Arrange
		List<Contact> expectedList = new ArrayList<Contact>();
		expectedList.add(new Contact("Namrata", "Diwate", 7894561230l, "ndiwate@gmail.com"));
		
		// Act
		ContactManager cm = new ContactManager();
		cm.addToContacts("Namrata", "Diwate", 7894561230l, "ndiwate@gmail.com");
		
		// Assert
		assertThat(ContactManager.getList(), is(expectedList));
	}
	
	 * @Test public void testModifyContactByName() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testSearchContactByKey() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testDeleteContact() { fail("Not yet implemented"); }
	 */

}
