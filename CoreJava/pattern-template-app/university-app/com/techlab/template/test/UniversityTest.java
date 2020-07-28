package com.techlab.template.test;

import com.techlab.template.*;

public class UniversityTest {

	 public static void main(String[] args) {

	      University mu = new TechnicalCourse();
	      mu.startProcess();
	      
	      System.out.println();
	      
	      mu = new NonTechnicalCourse();
	      mu.startProcess();		
	   }
}
