package com.techlab.solution;

public class Robots implements IWorkAble {

	@Override
	public void startWork() {
		System.out.println("Robot Starts Work....");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stops Working....");
	}

}
