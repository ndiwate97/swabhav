package com.techlab.simplefactory;

public class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Tesla starts......");
	}

	@Override
	public void stop() {
		System.out.println("Tesla stoped......");
	}

}
