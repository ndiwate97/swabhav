package com.techlab.violation.test;

import com.techlab.violation.ElectricPowerSwitch;
import com.techlab.violation.LightBulb;

public class ElectricPowerSwitchTest {

	public static void main(String[] args) {

		ElectricPowerSwitch e = new ElectricPowerSwitch(new LightBulb());

		e.press();
		e.press();

	}

}
