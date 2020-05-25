package com.techlab.violation.test;

import com.techlab.violation.*;

public class IspTest {
	
	public static void main(String[] args) {
		
		Managers manager = new Managers();
		manager.startEat();
		manager.stopEat();
		manager.startWork();
		manager.stopWork();
		
		Robots robot = new Robots();
		robot.startEat();
		robot.stopEat();
		robot.startWork();
		robot.stopWork();
	}

	
}
