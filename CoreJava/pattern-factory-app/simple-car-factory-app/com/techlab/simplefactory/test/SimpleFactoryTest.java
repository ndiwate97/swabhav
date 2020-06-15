package com.techlab.simplefactory.test;

import com.techlab.simplefactory.AutoType;
import com.techlab.simplefactory.AutomobileFactory;
import com.techlab.simplefactory.IAutomobile;

public class SimpleFactoryTest {

	public static void main(String[] args) {

		AutomobileFactory factory = new AutomobileFactory();

		IAutomobile bmw = factory.make(AutoType.BMW);
		bmw.start();
		bmw.stop();

		IAutomobile audi = factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();

		AutomobileFactory factory1 = new AutomobileFactory();

		IAutomobile tesla = factory1.make(AutoType.TESLA);
		tesla.start();
		tesla.stop();

	}
}
