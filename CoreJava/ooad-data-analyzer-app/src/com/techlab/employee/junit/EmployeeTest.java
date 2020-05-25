package com.techlab.employee.junit;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.techlab.employee.*;

public class EmployeeTest {

	@Test
	public void testEmployee() {

		// Arrange
		int expectedemployeeId = 7698;
		String expectedemployeeName = "BLAKE";
		String expecteddesignation = "MANAGER";
		int expectedmanagerId = 7839; 
		Date expecteddateOfJoining = new Date(18, 4	, 1);
		double expectedsalary = 2850;
		double expectedcommission = 0;
		Department expecteddepartment = new Department(03);

		// Act
		Employee e = new Employee(7698, "BLAKE", "MANAGER", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));

		// Assert
		assertEquals(expectedemployeeId, e.getEmployeeId());
		assertEquals(expectedemployeeName, e.getEmployeeName());
		assertEquals(expecteddesignation, e.getDesignation());
		assertEquals(expectedmanagerId, e.getManagerId());
		assertEquals(expecteddateOfJoining, e.getDateOfJoining());
		assertEquals(expectedsalary, e.getSalary(),0);
		assertEquals(expectedcommission, e.getCommission(),0);
		assertEquals(expecteddepartment, e.getDepartment());
	}

}
