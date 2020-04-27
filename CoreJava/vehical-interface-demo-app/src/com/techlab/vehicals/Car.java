package com.techlab.vehicals;

import com.techlab.imoveable.IMoveable;

public class Car implements IMoveable {
	
	@Override
	public void start() {
		System.out.println("Car Starts....");
	}

	@Override
	public void stop() {
		System.out.println("Car Stops....");
	}

}
