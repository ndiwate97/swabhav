package com.techlab.game.test;

import java.util.Scanner;

import com.techlab.game.*;

public class GameTest {

	public static void main(String[] args) throws Exception {

		Player p1;
		Player p2;
		TicTacToe newGame ;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name of Player1 :");
		String player1Name = sc.next();
		System.out.println("Enter Name of Player2 :");
		String player2Name = sc.next();
		System.out.println("\n1.NOUGHT (O)\n2.CROSS (X)\nEnter the mark for "+player1Name+" : ");
		int Player1choice = sc.nextInt();

		if (Player1choice == 1) {
			p1 = new Player(player1Name, Mark.NOUGHT);
			p2 = new Player(player2Name, Mark.CROSS);
		} else {
			p1 = new Player(player1Name, Mark.CROSS);
			p2 = new Player(player2Name, Mark.NOUGHT);
		}
		
		System.out.println("Enter Board size (eg. 3 for 3*3) : ");
		int boardSize = sc.nextInt();
		 
		newGame = new TicTacToe(new Board(boardSize));
		
		newGame.showRules();
		newGame.startGame(p1, p2);

	}

}
