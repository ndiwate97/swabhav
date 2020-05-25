package com.techlab.solution;

public class ElectricPowerSwitch implements ISwitchWorking {

	public ISwitchAble device;
	public boolean on;

	public ElectricPowerSwitch(ISwitchAble device) {
		this.device = device;
		this.on = false;
	}

	@Override
	public boolean isOn() {

		return this.on;

	}

	@Override
	public void press() {
		boolean checkOn = isOn();
		if (checkOn) {
			device.turnOff();
			this.on = false;
		} else {
			device.turnOn();
			this.on = true;
		}

	}

}
