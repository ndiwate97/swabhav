package com.techlab.buttoncolour;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelColourDemo {

	public static void main(String[] args) {
		createUI();
	}

	public static void createUI() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new CustomActionListener(panel , Color.RED) );

		blueButton.addActionListener(new CustomActionListener(panel , Color.BLUE));
		panel.add(redButton);
		panel.add(blueButton);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}
