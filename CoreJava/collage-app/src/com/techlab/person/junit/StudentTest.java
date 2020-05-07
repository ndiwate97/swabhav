package com.techlab.person.junit;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.techlab.person.Branch;
import com.techlab.person.Student;

public class StudentTest {

	@Test
	public void testStudent() {
//		Arrange
		int expectedId = 1;
		String expectedName = "Namrata";
		String expectedAddress = "Ulhasnagar";
		String expectedDateOfBirth = "30/09/1997";
		Branch expectedBranch = Branch.COMP;
		
//		Act
		Student s= new Student(1, "Namrata", "Ulhasnagar", new Date(97,8,30), Branch.COMP);
		
//		Assert
		assertEquals(expectedId, s.getId());
		assertEquals(expectedName, s.getName());
		assertEquals(expectedAddress, s.getAddress());
		assertEquals(expectedDateOfBirth, s.getDateOfBirth());
		assertEquals(expectedBranch, s.getBranch());
	}

}
