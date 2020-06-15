package com.techlab.simplefactory;

public class AutomobileFactory {

	public IAutomobile make(AutoType type) {

		if (type == AutoType.AUDI) {
			return new Audi();
		} 
		else if (type == AutoType.BMW) {
			return new Bmw();
		}
		else
			return new Tesla();
	}
}
