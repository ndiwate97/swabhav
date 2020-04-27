package com.techlab.vehicals;

import com.techlab.imoveable.IMoveable;

public class Bike implements IMoveable {

	@Override
	public void start() {
		System.out.println("Bike Starts....");
	}

	@Override
	public void stop() {
		System.out.println("Bike Stops....");
	}
}
