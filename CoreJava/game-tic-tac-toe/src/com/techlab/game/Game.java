package com.techlab.game;

import java.util.Scanner;

public class Game {

	Board board;
	private static Mark gameBoard[][];
	Player turn;
	private int position;
	ResultAnalyser analyse;
	int noOfMoves = 0;

	Scanner sc = new Scanner(System.in);

	public Game(Board board) {

		this.board = board;
		gameBoard = this.board.getBoard();
		analyse = new ResultAnalyser(board);

		setBoard();

	}

	public void startGame(Player p1, Player p2) {

		turn = p1;
		
		while (noOfMoves < (Board.getBoardSize() * Board.getBoardSize())) {

			play(turn);

			if (analyse.checkWin()) {
				System.out.println(turn.getPlayerName() + " " + Result.WIN);
				showBoard();
				break;
			} else {
				System.out.println(Result.IN_PROGRESS);
			}

			if (turn.equals(p1))
				turn = p2;
			else
				turn = p1;

			showBoard();
			noOfMoves++;
		}

		if (!analyse.checkWin()) {
			System.out.println(Result.DRAW);
		}

	}

	private void play(Player turn) {

		System.out.println(turn.getPlayerName() + "'s turn :");

		do {
			System.out.println("Enter Position");
			position = sc.nextInt();
		} while (!Cell.isPositionFree(position));

		Board.putMark(position, turn.getMark());

	}

	private void setBoard() {
		for (int i = 0; i < Board.getBoardSize(); i++) {
			for (int j = 0; j < Board.getBoardSize(); j++) {
				gameBoard[i][j] = Mark.BLANK;
			}
		}
		showBoard();
	}

	private static void showBoard() {

		System.out.println("\n\n");

		for (int i = 0; i < Board.getBoardSize(); i++) {
			for (int j = 0; j < Board.getBoardSize(); j++) {
				System.out.print(gameBoard[i][j]);
				if (j < Board.getBoardSize() - 1)
					System.out.print(" | ");
			}
			if (i < Board.getBoardSize() - 1)
				System.out.println("\n----------\n");
			else
				System.out.println();
		}

	}

	public static void showRules() {
		System.out.println("\t\t\t  Tic-Tac-Toe\n\n");
		System.out.println("Choose a cell numbered from 1 to " + Board.getBoardSize() * Board.getBoardSize()
				+ " as below and play\n\n");

		int num = 1;

		for (int i = 0; i < Board.getBoardSize(); i++) {
			for (int j = 0; j < Board.getBoardSize(); j++) {
				System.out.print(num);
				num++;
				if (j < Board.getBoardSize() - 1)
					System.out.print(" | ");
			}
			if (i < Board.getBoardSize() - 1)
				System.out.println("\n----------\n");
		}

		System.out.println(
				"\nRules:\nThree marks of same type appear in a row either vertically or horizontally or diagonally,"
						+ "\nthe user of that mark will be declared winner by the system. "
						+ "\n\nIf all the squares of the board are filled and no user is the winner then"
						+ "\nthe game is declared as draw by the system.\n\n");

		return;
	}

}
