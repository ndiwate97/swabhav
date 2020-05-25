package com.techlab.violation;

public enum FestivalType {

	NORMAL, HOLI, DIWALI;

	@Override
	public String toString() {
		switch (this) {
		case NORMAL:
			return "Normal";
		case HOLI:
			return "Holi";
		case DIWALI:
			return "Diwali";
		default:
			return "Unspecified";
		}
	}
}
