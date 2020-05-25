package com.techlab.tictactoe.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.tictactoe.*;

public class GameTest {

	private final static char NOUGHT = 'O';
	private final static char CROSS = 'X';
	private static ArrayList<Integer> selectedPosition = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Game newGame;

		int turn = 1;
		int position;

		showRules();

		System.out.println("\n1.NOUGHT (O)\n2.CROSS (X)\nEnter the mark for player1 : ");
		int Player1choice = sc.nextInt();

		if (Player1choice == 1)
			newGame = new Game(NOUGHT, CROSS);
		else
			newGame = new Game(CROSS, NOUGHT);

		int noOfMoves = 0;
		while (noOfMoves < 9) {

			if (turn == 1) {
				System.out.println("Player1's turn :");
				
				do {
					System.out.println("Enter Position");
					position = sc.nextInt();
				}while(!isUnique(position));
				
				newGame.putMark(position, newGame.getPlayer1Mark());

				if (newGame.checkWin()) {
					System.out.println("Player1 Wins.......");
					showBoard(newGame);
					break;
				}

				turn = 2;

			} else {
				System.out.println("Player2's turn :");
				
				do {
					System.out.println("Enter Position");
					position = sc.nextInt();
				}while(!isUnique(position));

				newGame.putMark(position, newGame.getPlayer2Mark());

				if (newGame.checkWin()) {
					System.out.println("Player2 Wins.......");
					showBoard(newGame);
					break;
				}

				turn = 1;
			}
			
			showBoard(newGame);
			selectedPosition.add(position);
			noOfMoves++;

		}

		if (newGame.checkWin() == false) {
			System.out.println("This is a Draw.....");
		}

	}

	private static boolean isUnique(int position) {
		if(selectedPosition.contains(position)) {
			System.err.println("position already aquired....!\nSelect Different Position.....");
			return false;
		}
		return true;
	}

	private static void showBoard(Game newGame) {

		char[][] board = newGame.getBoard();

		System.out.println("\n\n");

		System.out.println(board[0][0]+" | "+ board[0][1] +" | " + board[0][2]+"\n");
		System.out.println("----------\n");
		System.out.println(board[1][0]+" | "+ board[1][1] +" | " + board[1][2]+"\n");
		System.out.println("-----------\n");
		System.out.println(board[2][0]+" | "+ board[2][1] +" | " + board[2][2]+"\n");

	}

	public static void showRules() {
		System.out.println("\t\t\t  Tic-Tac-Toe\n\n");
		System.out.println("Choose a cell numbered from 1 to 9 as below and play\n\n");

		System.out.println("\t\t\t  1 | 2  | 3  \n");
		System.out.println("\t\t\t--------------\n");
		System.out.println("\t\t\t  4 | 5  | 6  \n");
		System.out.println("\t\t\t--------------\n");
		System.out.println("\t\t\t  7 | 8  | 9  \n\n");

		System.out.println("\nRules:\nThree marks of same type appear in a row either vertically or horizontally or diagonally,"
				+ "\n the user of that mark will be declared winner by the system. "
				+ "\nIf all the squares of the board are filled and no user is the winner then"
				+ "\n the game is declared as draw by the system.");

		return;
	}
}
