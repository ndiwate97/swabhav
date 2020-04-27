package com.techlab.human;

import com.techlab.interfaces.IEmotionable;
import com.techlab.interfaces.ISocializable;

public class Men implements IEmotionable, ISocializable {

	@Override
	public void wish() {
		System.out.println("Men is Wishing...");
	}

	@Override
	public void depart() {
		System.out.println("Men is Departing...");
	}

	@Override
	public void cry() {
		System.out.println("Men is Crying...");

	}

	@Override
	public void laugh() {
		System.out.println("Men is Laughing...");
	}

}
