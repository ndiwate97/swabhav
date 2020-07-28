package com.techlab.template;

public abstract class University {
	
	abstract void fillForm();

	abstract void getList();

	abstract void feePayment();

	// template method
	public final void startProcess() {

		fillForm();

		getList();
		
		feePayment();
	}
}