package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeFrame {
	
	public HomeFrame() {
		createFrame();
	}

	public void createFrame() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton timeButton = new JButton("DisplayTime");
		JButton helloButton = new JButton("Hello");

		timeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DigitalWatch d = new DigitalWatch();
				frame.remove(panel);
				frame.add(d.watchPanel);
			}

		});

		panel.add(timeButton);
		panel.add(helloButton);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		HomeFrame h = new HomeFrame();
	}

}
