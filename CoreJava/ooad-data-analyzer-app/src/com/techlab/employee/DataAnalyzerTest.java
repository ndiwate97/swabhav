package com.techlab.employee;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.junit.Test;

public class DataAnalyzerTest {

	@Test
	public void testAddEmployees() {

		// Arrange
		ArrayList<Employee> ExpectedEmployees = new ArrayList<Employee>();
		Employee e = new Employee(7698, "BLAKE", "MANAGER", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		ExpectedEmployees.add(e);

		// Act
		DataAnalyzer d = new DataAnalyzer();
		Employee e1 = new Employee(7698, "BLAKE", "MANAGER", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		Employee e2 = new Employee(7698, "BLAKE", "MANAGER", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		d.addEmployees(e1);
		d.addEmployees(e2);

		// Assert
		assertEquals(ExpectedEmployees, d.getEmployees());
	}

	@Test
	public void testMaxSaleriedEmployee() {

		// Arrange
		Employee expectedEmployee = new Employee(7698, "BLAKE", "MANAGER", 7839, new Date(18, 4, 1), 2850, 0,
				new Department(03));

		// Act
		DataAnalyzer d = new DataAnalyzer();
		Employee e1 = new Employee(7698, "BLAKE", "MANAGER", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		Employee e2 = new Employee(7440, "MARK", "MANAGER", 7564, new Date(17, 6, 1), 2500, 0, new Department(02));
		d.addEmployees(e1);
		d.addEmployees(e2);

		// Assert
		assertEquals(expectedEmployee, d.maxSaleriedEmployee());

	}

	@Test
	public void testNoOfEmployeeDeptWise() {

		// Arrange
		HashMap<Integer, Integer> expectedCount = new HashMap<Integer, Integer>();
		expectedCount.put(1, 1);
		expectedCount.put(2, 1);
		expectedCount.put(3, 2);

		// Act
		DataAnalyzer d = new DataAnalyzer();
		Employee e1 = new Employee(1001, "FORD", "ANALYST", 7839, new Date(18, 4, 1), 2850, 0, new Department(01));
		Employee e2 = new Employee(1002, "ADAMS", "CLERK", 7839, new Date(18, 4, 1), 2850, 0, new Department(02));
		Employee e3 = new Employee(1003, "JONES", "ANALYST", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		Employee e4 = new Employee(1004, "BLAKE", "PRESIDENT", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		d.addEmployees(e1);
		d.addEmployees(e2);
		d.addEmployees(e3);
		d.addEmployees(e4);
		HashMap<Integer, Integer> actualCount = d.noOfEmployeeDeptWise();

		// Assert
		assertEquals(expectedCount, actualCount);

	}

	@Test
	public void testNoOfEmployeeDesignationWise() {
		// Arrange
		HashMap<String, Integer> expectedCount = new HashMap<String, Integer>();
		expectedCount.put("ANALYST", 2);
		expectedCount.put("CLERK", 1);
		expectedCount.put("PRESIDENT", 1);

		// Act
		DataAnalyzer d = new DataAnalyzer();
		Employee e1 = new Employee(1001, "FORD", "ANALYST", 7839, new Date(18, 4, 1), 2850, 0, new Department(01));
		Employee e2 = new Employee(1002, "ADAMS", "CLERK", 7839, new Date(18, 4, 1), 2850, 0, new Department(02));
		Employee e3 = new Employee(1003, "JONES", "ANALYST", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		Employee e4 = new Employee(1004, "BLAKE", "PRESIDENT", 7839, new Date(18, 4, 1), 2850, 0, new Department(03));
		d.addEmployees(e1);
		d.addEmployees(e2);
		d.addEmployees(e3);
		d.addEmployees(e4);
		HashMap<String, Integer> actualCount = d.noOfEmployeeDesignationWise();

		// Assert
		assertEquals(expectedCount, actualCount);
	}

}
