package com.techlab.violation;

public class Robots implements IWorkAble {

	@Override
	public void startWork() {
		System.out.println("Robot Starts Work....");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stops Working....");
	}

	@Override
	public void startEat() {
		System.err.println("I can't Eat....");
	}

	@Override
	public void stopEat() {
		System.err.println("I can't Eat....");
	}
}
