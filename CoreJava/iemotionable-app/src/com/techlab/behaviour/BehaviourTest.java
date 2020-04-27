package com.techlab.behaviour;

import com.techlab.human.*;
import com.techlab.interfaces.IEmotionable;
import com.techlab.interfaces.ISocializable;

public class BehaviourTest {
	public static void main(String[] args) {
		Men m = new Men();
		atTheParty(m,m);
		atTheMovie(m);

		Boy b = new Boy();
//		atTheParty(b);
		atTheMovie(b);
	}


	private static void atTheMovie(IEmotionable e) {
		System.out.println("\nAt The Movie : ");
		e.cry();
		e.laugh();
	}

	private static void atTheParty(IEmotionable e, ISocializable s) {
		System.out.println("\nAt The Party : ");
		e.cry();
		e.laugh();
		s.wish();
		s.depart();
	}
}
