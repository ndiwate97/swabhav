package com.techlab.template;

public class TechnicalCourse extends University {

	   @Override
	   void fillForm() {
	      System.out.println("Form Fill for Technical stream in progress...!");
	   }

	   @Override
	   void getList() {
	      System.out.println("List of Students selected for Technical stream display...!");
	   }

	   @Override
	   void feePayment() {
	      System.out.println("Fees payment in Technical institutes started...!");
	   }
	}
