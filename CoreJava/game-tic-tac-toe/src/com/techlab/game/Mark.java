package com.techlab.game;

public enum Mark {

	NOUGHT, CROSS, BLANK;

	
	

	@Override
	public String toString() {
		switch (this) {
		case NOUGHT :
			return "O";
		case CROSS:
			return "X";
		case BLANK:
			return "-";
		default:
			return "Unspecified";
		}

	}

}