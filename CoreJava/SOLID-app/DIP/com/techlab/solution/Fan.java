package com.techlab.solution;

public class Fan implements ISwitchAble {

	@Override
	public void turnOn() {
		System.out.println("Fan: Fan turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan: Fan turned off...");
	}

}
