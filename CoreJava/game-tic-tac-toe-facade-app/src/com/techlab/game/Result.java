package com.techlab.game;

public enum Result {

	WIN, DRAW, IN_PROGRESS;
	
	@Override
	public String toString() {

		switch (this) {
		case WIN :
			return "Wins the Game";
		case DRAW:
			return "The game is Draw";
		case IN_PROGRESS:
			return "Game is in progress...";
		default:
			return "Unspecified";
		}

	}

}
