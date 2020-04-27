package com.techlab.human;

import com.techlab.interfaces.IEmotionable;

public class Boy implements IEmotionable {

	@Override
	public void cry() {
		System.out.println("Boy is Crying...");

	}

	@Override
	public void laugh() {
		System.out.println("Boy is Laughing...");
	}

}
