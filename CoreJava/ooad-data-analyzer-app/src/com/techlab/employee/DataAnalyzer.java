package com.techlab.employee;

import java.util.ArrayList;
import java.util.HashMap;

public class DataAnalyzer {

	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void addEmployees(Employee e) {

		boolean isUnique = false;

		for (Employee employee : employees) {

			if (employee.getEmployeeId() == e.getEmployeeId()) {
				isUnique = false;
//				System.err.println("Employee already exist.....");
				break;

			} else {
				isUnique = true;
			}

		}
		if (employees.isEmpty() || isUnique) {
			employees.add(e);
//			System.out.println("done....");
		}

	}

	public Employee maxSaleriedEmployee() {
		double maxSalary = 0;
		Employee e = null;

		for (Employee employee : employees) {
			if (employees.isEmpty()) {
				System.err.println("No Employees found...........");
				e = null;
			} else if (maxSalary < employee.getSalary()) {
				maxSalary = employee.getSalary();
				e = employee;
			}
		}

		return e;
	}

	public HashMap<Integer, Integer> noOfEmployeeDeptWise() {

		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		int newValue = 1;
		boolean isUnique = false;

		for (Employee employee : employees) {

			for (Integer i : count.keySet()) {

				if (i == employee.getDepartment().getDepartmentId()) {
					count.replace(i, count.get(i) + 1);
					isUnique = false;
					break;
				} else
					isUnique=true;
			}
			if(count.isEmpty()||isUnique) {
				count.putIfAbsent(employee.getDepartment().getDepartmentId(), newValue);
			}
		}
		
//		System.err.println(count);
		return count;
	}

	public HashMap<String, Integer> noOfEmployeeDesignationWise() {

		HashMap<String, Integer> count = new HashMap<String, Integer>();
		int newValue = 1;
		boolean isUnique = false;

		for (Employee employee : employees) {

			for (String designation : count.keySet()) {

				if (designation.equalsIgnoreCase(employee.getDesignation())) {
					count.replace(designation, count.get(designation) + 1);
					isUnique=false;
					break;
				} else
					isUnique=true;
			}
			if(count.isEmpty()||isUnique) {
				count.putIfAbsent(employee.getDesignation(), newValue);
			}
		}
		
		return count;
		

	}

}
