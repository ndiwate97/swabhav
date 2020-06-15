package com.techlab.game;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import com.techlab.game.test.TicTacToeTest;

public class Game {

	Board board;
	static Player turn;
	static ResultAnalyser analyse;
	static int noOfMoves = 0;

	Scanner sc = new Scanner(System.in);

	public Game(Board board) {

		this.board = board;
		analyse = new ResultAnalyser(Cell.cell);
		turn = TicTacToeTest.p2;

	}

	public static Player getTurn() {
		if (turn.equals(TicTacToeTest.p1)) {
			return TicTacToeTest.p2;
		} else
			return TicTacToeTest.p1;
	}

	public static JPanel showRules(Board b) {

		JPanel rulesPanel = new JPanel();

		JTextArea rules = new JTextArea(
				"\nRules:\nThree marks of same type appear in a row\n either vertically or horizontally or diagonally,"
						+ "\nthe user of that mark will be declared\n winner by the system. "
						+ "\n\nIf all the squares of the board are\n filled and no user is the winner then"
						+ "\nthe game is declared as draw by\n the system.\n\n");
		rules.setPreferredSize(new Dimension(250, 200));

		rulesPanel.add(rules);

		return rulesPanel;
	}

	public static void analyze() throws Exception {

		if (analyse.checkWin()) {

			showResult(turn.getPlayerName() + " " + Result.WIN);

		}

		if (noOfMoves == Board.getBoardSize() * Board.getBoardSize()) {
			showResult("" + Result.DRAW);
		}
	}

	private static void showResult(String result) {
		JDialog d = new JDialog(TicTacToeTest.frame, "dialog Box");

		JPanel p = new JPanel();

		JLabel l = new JLabel();

		l.setText(result);

		JButton restart = new JButton("Restart");
		JButton exit = new JButton("Exit");

		p.add(l);
		p.add(restart);
		p.add(exit);

		d.add(p);
		d.setSize(200, 200);

		d.setVisible(true);

		d.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				TicTacToeTest.frame.dispose();
			}
		});

		restart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TicTacToeTest.frame.dispose();
				new TicTacToeTest();

			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TicTacToeTest.frame.dispose();
			}
		});

	}

}
