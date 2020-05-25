package com.techlab.solution.test;

import com.techlab.solution.*;

public class IspTest {
	
	public static void main(String[] args) {
		
		Managers manager = new Managers();
		manager.startEat();
		manager.stopEat();
		manager.startWork();
		manager.stopWork();
		
		Robots robot = new Robots();
		robot.startWork();
		robot.stopWork();
	}

	
}
