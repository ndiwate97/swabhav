package com.techlab.game;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private int systemNumber;

	public boolean startGame(int systemNumber, int userNumber ) {
		if (systemNumber > userNumber) {
			System.err.println("Your guess is low");
			return true;
		} else if (systemNumber < userNumber) {
			System.err.println("Your guess is high");
			return true;
		} else {
			System.out.println("Your guess is right....!");
			return false;
		}
	}

}
