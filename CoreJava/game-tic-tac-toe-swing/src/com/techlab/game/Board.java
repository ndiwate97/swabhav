package com.techlab.game;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {

	private static int boardSize;
	JPanel board = new JPanel();

	public Board(int boardSize) {

		board = Cell.addCell(board, boardSize);

		board.setLayout(new GridLayout(boardSize, boardSize));

		Board.boardSize = boardSize;
	}

	public static int getBoardSize() {
		return boardSize;
	}
	
	public JPanel getBoard() {
		return board;
	}
	


}
