package com.techlab.solution.test;

import com.techlab.solution.*;
public class TaxCalculationTest {
	
	public static void main(String[] args) {
		
		TaxCalculation txc = new TaxCalculation( new XmlLogger());
		System.out.println(txc.calculate(10, 5));
		System.out.println(txc.calculate(0, 0));
	}

}
