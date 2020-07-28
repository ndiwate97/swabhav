package com.techlab.frame;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WelcomeScreen {

	static JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton welcomeButton = new JButton("Welcome to swabhav techlabs");

	public WelcomeScreen() {
		showWelcomeScreen();
	}

	public void showWelcomeScreen() {

		welcomeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RegistrationForm rf = new RegistrationForm();
				frame.remove(panel);
				frame.add(rf.getRegistrationForm());
				frame.setVisible(true);
				frame.setSize(200, 300);
			}

		});

		panel.add(welcomeButton);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}

}
