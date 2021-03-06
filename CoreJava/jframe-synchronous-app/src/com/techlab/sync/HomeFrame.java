package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

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
				while (true) {
					Date dNow = new Date();
					SimpleDateFormat ft = new SimpleDateFormat(" hh:mm:ss");

					System.out.println(ft.format(dNow));

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}

		});

		helloButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				while (true)
					System.out.println("Hello");

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
