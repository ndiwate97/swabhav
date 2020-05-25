package com.techlab.tictactoe;

import javax.annotation.PostConstruct;

public class Game {

	private char[][] board = new char[3][3];
	private final int BOARD_SIZE = 3;

	private char player1Mark;
	private char player2Mark;

	public Game(char player1Mark, char player2Mark) {
		this.player1Mark = player1Mark;
		this.player2Mark = player2Mark;
		initializeBoard();
	}

	public char getPlayer1Mark() {
		return player1Mark;
	}

	public char getPlayer2Mark() {
		return player2Mark;
	}
	
	public char[][] getBoard() {
		return board;
	}
	

	private void initializeBoard() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++)
				board[i][j] = ' ';

		}
	}

	private boolean checkVertical() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ')
				return (true);
		}
		return (false);
	}

	private boolean checkHorizontal() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ')
				return (true);
		}
		return (false);
	}

	public boolean checkDiagonally() {
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
			return (true);

		else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
			return (true);

		return (false);
	}

	public void putMark(int position, char mark) {
		int x = (position - 1) / BOARD_SIZE;
		int y = (position - 1) % BOARD_SIZE;
		board[x][y]=mark;
	}

	public boolean checkWin() {
		return (checkVertical() || checkHorizontal() || checkDiagonally());
	}

}
