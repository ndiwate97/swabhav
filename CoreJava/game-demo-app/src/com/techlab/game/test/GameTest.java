package com.techlab.game.test;

import java.util.Random;
import java.util.Scanner;
import com.techlab.game.Game;

public class GameTest {

	public final static int START = 1;
	public final static int EXIT = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		boolean newGame = true, retry;

		Game g = new Game();

		while (choice != EXIT) {

			if (newGame)
				System.out.println("1.Start\n2.Exit\nEnter your Choice : ");
			else
				System.out.println("1.Restart\n2.Exit\nEnter your Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case START:
				retry=true;
				Random randomNumber = new Random();
				int systemNumber = randomNumber.nextInt(10);
				while (retry) {
					System.out.println("Enter Your Guessed number (within 0-10): ");
					int userNumber = sc.nextInt();
					if (userNumber > 10)
						System.err.println("Your number excide the limit...!");
					else
						retry=g.startGame(systemNumber,userNumber);
				}
				newGame = false;
				break;

			case EXIT:
				System.out.println("Game Over....!");
				sc.close();
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

}
