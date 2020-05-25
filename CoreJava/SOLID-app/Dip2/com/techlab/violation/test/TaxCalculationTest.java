package com.techlab.violation.test;

import com.techlab.violation.*;

public class TaxCalculationTest {
	
	public static void main(String[] args) {
		
		TaxCalculation txc = new TaxCalculation(LogType.XML);
		System.out.println(txc.calculate(10, 5));
		System.out.println(txc.calculate(0, 0));
	}

}
