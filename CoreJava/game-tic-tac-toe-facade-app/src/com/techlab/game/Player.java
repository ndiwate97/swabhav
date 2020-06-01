package com.techlab.game;

public class Player {

	private String playerName;
	private Mark mark;

	public Player(String playerName, Mark mark) {
		this.playerName = playerName;
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public String getPlayerName() {
		return playerName;
	}

}
