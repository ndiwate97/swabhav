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

	public static boolean isPositionFree(int position) throws CellIsAlreadyOccupied {

		if (selectedPosition.contains(position)) {
			try {
				throw new CellIsAlreadyOccupied("Cell Is Already Occupied.....");
			} catch (CellIsAlreadyOccupied e) {
				System.err.println(e.getMessage());
			}

		} else if (position <= (Board.getBoardSize() * Board.getBoardSize())) {

			selectedPosition.add(position);
			return true;

		} else {

			System.out.println("Invalid Position....");
			return false;

		}
		return false;
	}

}
