package com.techlab.template;

public class NonTechnicalCourse extends University {

	   @Override
	   void fillForm() {
	      System.out.println("Form Fill for Non-Technical stream in progress...!");
	   }

	   @Override
	   void getList() {
	      System.out.println("List of Students selected for Non-Technical stream display...!");
	   }

	   @Override
	   void feePayment() {
	      System.out.println("Fees payment in Non-Technical institutes started...!");
	   }
	}
