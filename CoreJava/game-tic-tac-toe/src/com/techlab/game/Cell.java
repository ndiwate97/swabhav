package com.techlab.game;

import java.util.ArrayList;

public class Cell {

	private int x, y;
	private static int position;
	public static ArrayList<Integer> selectedPosition = new ArrayList<Integer>();

	public Cell(int position) {
		Cell.position = position;
		CalculateCellCoordinates();
	}

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

}
