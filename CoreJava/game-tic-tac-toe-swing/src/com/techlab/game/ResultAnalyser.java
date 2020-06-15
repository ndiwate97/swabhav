package com.techlab.game;

import javax.swing.JButton;

public class ResultAnalyser {

	JButton cell[];

	public ResultAnalyser(JButton[] cell) {
		this.cell = cell;
	}

	private boolean checkVertical() {
		int i, j;
		for (i = 0; i <= Board.getBoardSize() * (Board.getBoardSize() - 1); i = i + Board.getBoardSize()) {
			for (j = i; j < i + (Board.getBoardSize() - 1); j++) {
				if (cell[i].getText().isEmpty())
					return false;
				else {
					if (!cell[j].getText().equals(cell[j + 1].getText()))
						break;
				}

			}
			if (j == i + (Board.getBoardSize() - 1)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkHorizontal() throws Exception{

		int i, j;
		for (i = 0; i < Board.getBoardSize(); i++) {
			for (j = i; j < i + (Board.getBoardSize() * (Board.getBoardSize() - 1)); j = j + Board.getBoardSize()) {

				System.out.println("j======" + j + "-----------" + Cell.cell[j].getText());

				String one = Cell.cell[j].getText();
				String two = Cell.cell[j + Board.getBoardSize()].getText();

				if (one.equals(null))
					break;

				if (!one.equals(two))
					break;

			}
			if (j == i + (Board.getBoardSize() * (Board.getBoardSize() - 1))) {
				return true;
			}
		}
		return (false);

	}

	private boolean checkDiagonally() {

		int i = 0;
		for (i = Board.getBoardSize() - 1; i < Board.getBoardSize()
				* (Board.getBoardSize() - 1); i += Board.getBoardSize() - 1) {

			if (cell[i].getText().equals(null))
				return false;
			else {
				if (!cell[i].getText().equals(cell[i + Board.getBoardSize() - 1].getText()))
					break;
			}

		}

		if (i == Board.getBoardSize() * (Board.getBoardSize() - 1))
			return true;
		return false;

	}

	private boolean checkAntiDiagonally() {

		int i = 0;
		for (i = 0; i < (Board.getBoardSize() * Board.getBoardSize()) - 1; i += Board.getBoardSize() + 1) {

			if (cell[i].getText().isEmpty())
				return false;
			else {
				if (!cell[i].getText().equals(cell[i + Board.getBoardSize() + 1].getText()))
					break;
			}

		}

		if (i == (Board.getBoardSize() * Board.getBoardSize()) - 1)
			return true;
		return false;

	}

	public boolean checkWin() throws Exception {
//		return (checkHorizontal() || checkVertical() || checkDiagonally() || checkAntiDiagonally());
		return  checkHorizontal();
	}

}
