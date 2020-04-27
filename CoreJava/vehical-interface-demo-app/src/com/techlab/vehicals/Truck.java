package com.techlab.vehicals;

import com.techlab.imoveable.IMoveable;

public class Truck implements IMoveable {

	@Override
	public void start() {
		System.out.println("Truck Starts....");
	}

	@Override
	public void stop() {
		System.out.println("Truck Stops....");
	}

}
