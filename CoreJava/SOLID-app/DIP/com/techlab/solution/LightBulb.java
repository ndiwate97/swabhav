package com.techlab.solution;

public class LightBulb implements ISwitchAble {
	
	@Override
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off...");
	}
	
}
