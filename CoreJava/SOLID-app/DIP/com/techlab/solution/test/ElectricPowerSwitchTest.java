package com.techlab.solution.test;

import com.techlab.solution.*;

public class ElectricPowerSwitchTest {

	public static void main(String[] args) {

		ISwitchAble switchableBulb = new LightBulb();
		ISwitchWorking bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		
		ISwitchAble switchableFan = new Fan();
		ISwitchWorking fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();

	}

}
