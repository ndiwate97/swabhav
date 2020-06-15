package com.techlab.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Cell {

	public static JButton cell[];
	private int x, y;
	private static int position;
	public static ArrayList<Integer> selectedPosition = new ArrayList<Integer>();

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void CalculateCellCoordinates() {

		x = (position - 1) / Board.getBoardSize();
		y = (position - 1) % Board.getBoardSize();

	}

	public static boolean isPositionFree(int position) {

		if (selectedPosition.contains(position)) {
			System.err.println("Position already occupied....");
			return false;

		}
		if (position <= (Board.getBoardSize() * Board.getBoardSize())) {

			selectedPosition.add(position);
			return true;

		} else {

			System.out.println("Invalid Position....");
			return false;

		}
	}

	public static JPanel addCell(JPanel board, int boardSize) {
		cell = new JButton[boardSize * boardSize];
		int x = boardSize * boardSize + 1;
		int y = boardSize * boardSize + 1;
		int j = 0;
		int i = 0;
		for (i = 0; i < boardSize * boardSize; i++, x += 100, j++) {

			int position = i;

			cell[i] = new JButton();
			if (j == boardSize) {
				j = 0;
				y += 100;
				x = 10;
			}
			cell[i].setText(null);
			cell[i].setBounds(x, y, 100, 100);
			board.add(cell[i]);
			cell[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						putMark(position);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
		}
		return board;
	}

	public static void putMark(int position) throws Exception {

		if (cell[position].getText() == null) {

			Player turn = Game.getTurn();
			Game.turn = turn;
			Game.noOfMoves += 1;
			System.out.println(Game.noOfMoves + "------------" + turn.getMark().toString()+"----------------"+position);

			cell[position].setText(turn.getMark().toString());

			Game.analyze();
		}

	}

}
