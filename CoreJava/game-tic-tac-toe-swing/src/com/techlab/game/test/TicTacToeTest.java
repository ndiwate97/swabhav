package com.techlab.game.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.techlab.game.*;

public class TicTacToeTest implements Runnable  {

	public static Player p1;
	public static Player p2;
	public static Board board;

	public static JFrame frame ;
	static JPanel panel = new JPanel();

	static JLabel player1 = new JLabel();
	static JLabel player2 = new JLabel();
	static JLabel boardSizeLabel = new JLabel();

	static JTextField p1Info = new JTextField(5);
	static JTextField p2Info = new JTextField(5);
	static JTextField boardSizeText = new JTextField(5);

	static JButton button = new JButton();

	public TicTacToeTest() {
		 frame = new JFrame();
		
		System.out.println("in constructor");
//		frame.remove(panel);
		startGame();
//		Thread t = new Thread();
//		t.start();
	}

	public static void main(String[] args) {
//		startGame();
		new TicTacToeTest();

	}
	
	@Override
	public void run() {
		startGame();
		
	}

	public static void startGame() {
		System.out.println("start game");
		player1.setText("Enter Name of Player1 :");
		player2.setText("Enter Name of Player2 :");
		boardSizeLabel.setText("Enter Board size (eg. 3 for 3*3) : ");

		button.setText("Submit");

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String player1Name = p1Info.getText();
				String player2Name = p2Info.getText();

				if (player1Name.equals("")) {
					player1Name = "Player1";
				}

				if (player2Name.equals("")) {
					player2Name = "Player2";
				}

				p1 = new Player(player1Name, Mark.CROSS);
				p2 = new Player(player2Name, Mark.NOUGHT);

				board = new Board(Integer.parseInt(boardSizeText.getText()));
				
//				showRules();

				showBoard();
			}

		});

		panel.add(player1);
		panel.add(p1Info);
		panel.add(player2);
		panel.add(p2Info);
		panel.add(boardSizeLabel);
		panel.add(boardSizeText);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);

	}

	public static void showRules() {

		frame.remove(panel);

		panel = Game.showRules(board);

		button.setText("Continue");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				showBoard();
				
			}
		});
		
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);

	}

	public static void showBoard() {

		System.out.println("showBoard called");
		Game newGame = new Game(board);
		
		frame.remove(panel);
		

		panel = board.getBoard();
		
		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(Board.getBoardSize() * 100, Board.getBoardSize() * 100);
		
	}

	

}