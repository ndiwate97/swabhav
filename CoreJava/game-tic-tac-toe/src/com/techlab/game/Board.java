package com.techlab.game;

public class Board {

	private static int boardSize;
	public static Mark board[][];

	public Board(int boardSize) {
		Board.boardSize = boardSize;
		board = new Mark[boardSize][boardSize];
	}

	public static int getBoardSize() {
		return boardSize;
	}

	public Mark[][] getBoard() {
		return board;
	}

	public static void putMark(int position, Mark m) {

		Cell c = new Cell(position);
			board[c.getX()][c.getY()] = m;
		
	}

}
