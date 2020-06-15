package com.techlab.simplefactory;

public class AutomobileFactory {
	
private static AutomobileFactory factory;
	
	private AutomobileFactory() {
		System.out.println("Factory Created");
	}
	
	public static AutomobileFactory getInstance() {
		if(factory==null) {
			factory = new AutomobileFactory();
		}
		return factory;
	}

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
