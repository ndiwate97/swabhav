package com.techlab.game;

public class ResultAnalyser {

	Board board;
	private Mark gameBoard[][];

	public ResultAnalyser(Board board) {
		this.board = board;
		gameBoard = this.board.getBoard();
	}

	private boolean checkVertical() {
		int i, j;
		for (i = 0; i < Board.getBoardSize(); i++) {
			for (j = 0; j < Board.getBoardSize() - 1; j++) {
				if (gameBoard[i][0] != Mark.BLANK) {
					if (gameBoard[i][j] != gameBoard[i][j + 1])
						return false;
				} else
					return false;

			}
			if (j < Board.getBoardSize()) {
				return true;
			}
		}
		return (false);
	}

	private boolean checkHorizontal() {

		int i, j;
		for (i = 0; i < Board.getBoardSize(); i++) {
			for (j = 0; j < Board.getBoardSize() - 1; j++) {
				if (gameBoard[0][i] != Mark.BLANK) {
					if (gameBoard[j][i] != gameBoard[j + 1][i])
						return false;
				} else
					return false;

			}
			if (j < Board.getBoardSize()) {
				return true;
			}
		}
		return (false);
	}

	private boolean checkDiagonally() {

		boolean returnResult = false;
		int i;
		for (i = 0; i < Board.getBoardSize() - 1; i++) {
			if (gameBoard[0][i] == Mark.CROSS || gameBoard[0][i] == Mark.NOUGHT) {
				if (gameBoard[i][i] == gameBoard[i + 1][i + 1])
					continue;
				else {
					i = 0;
					returnResult = false;
					break;
				}
			}
		}

		if (i == Board.getBoardSize() - 1)
			return true;

		int j = Board.getBoardSize() - 1;
		for (i = 0; i < Board.getBoardSize() - 1; i++) {
			if (gameBoard[i][j] == Mark.CROSS || gameBoard[i][j] == Mark.NOUGHT) {
				if (gameBoard[i][j] == gameBoard[i + 1][j - 1])
					j--;
				else {
					i = 0;
					j = 0;
					returnResult = false;
					break;
				}
			}
			else {
				i = 0;
				j = 0;
				returnResult = false;
				break;
			}
		}

		if (i == Board.getBoardSize() - 1 && j == 1)
			return true;

		return returnResult;
	}

	public boolean checkWin() {
		return (checkVertical() || checkHorizontal() || checkDiagonally());
	}

}
