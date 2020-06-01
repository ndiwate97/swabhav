package com.techlab.game;

public interface BoardGame {

	public void showRules();

	public void setBoard();

	public void showBoard();

	public void startGame(Player p1, Player p2) throws Exception;

	public boolean play(Player turn) throws CellIsAlreadyOccupied;

}
