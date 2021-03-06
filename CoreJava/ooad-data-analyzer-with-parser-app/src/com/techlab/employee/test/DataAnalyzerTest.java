package com.techlab.employee.test;

import java.util.*;
import com.techlab.employee.*;

public class DataAnalyzerTest {

	public static void main(String[] args) throws Exception {

		DataAnalyzer d = new DataAnalyzer();

		EmployeeParser ep;		

		UrlLoader dataLoader = new UrlLoader();
//		dataLoader.setSource("https://swabhav-tech.firebaseapp.com/emp.txt");
		ep = new EmployeeParser(new UrlLoader(), d);

	
		FileLoader dataLoader1 = new FileLoader();
//		dataLoader.setSource("..\\ooad-data-analyzer-with-parser-app\\src\\dataFile_emp.txt");
		ep = new EmployeeParser(new FileLoader(),d);
		

		System.out.println("All unique Employees :\n" + d.getEmployees());

		System.out.println("\nMaximum Salaried Employee :");
		Employee max = d.maxSaleriedEmployee();
		System.out.println(max);

		System.out.println("\nOther Employee details :");

		HashMap<Integer, Integer> countDeptWise = new HashMap<Integer, Integer>();
		countDeptWise = d.noOfEmployeeDeptWise();
		for (Integer i : countDeptWise.keySet()) {
			System.out.println("Department Id : " + i + " Total No of Employees : " + countDeptWise.get(i));
		}

		System.out.println();
		HashMap<String, Integer> countDesignationWise = new HashMap<String, Integer>();
		countDesignationWise = d.noOfEmployeeDesignationWise();
		for (String i : countDesignationWise.keySet()) {
			System.out.println("Total No of Employees present, as \"" + i.toUpperCase() + "\" is : " + countDesignationWise.get(i));
		}

	}

}
