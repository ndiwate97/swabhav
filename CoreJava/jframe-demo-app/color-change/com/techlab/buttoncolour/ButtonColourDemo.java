package com.techlab.buttoncolour;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonColourDemo {

	public static void main(String[] args) {
		createUI();
	}

	public static void createUI() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (redButton.getBackground() == Color.RED) {
					redButton.setBackground(null);
					redButton.setText("Red");
				} else {
					redButton.setBackground(Color.RED);
					redButton.setText("Reset");
				}
			}

		});

		blueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (blueButton.getBackground() == Color.BLUE) {
					blueButton.setBackground(null);
					blueButton.setText("Blue");
				} else {
					blueButton.setBackground(Color.BLUE);
					blueButton.setText("Reset");
				}
			}

		});
		panel.add(redButton);
		panel.add(blueButton);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}
