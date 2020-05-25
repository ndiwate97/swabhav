package com.techlab.violation;

public class Managers implements IWorkAble {

	@Override
	public void startWork() {
		System.out.println("Manager Starts Work....");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stops Working....");
	}

	@Override
	public void startEat() {
		System.out.println("Manager Starts Eating....");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stops Eating....");
	}

}
