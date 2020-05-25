package com.techlab.employee.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.employee.Department;

public class DepartmentTest {

	@Test
	public void testDepartment() {
		//Arrange
		int expectedDepartmentId = 3;
		
		//Act
		Department d = new Department(03);
		
		//Assert
		assertEquals(expectedDepartmentId, d.getDepartmentId());
	}

}
