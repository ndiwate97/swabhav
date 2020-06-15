package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeFrame  {

	public HomeFrame() {
		createFrame();
	}

	public void createFrame() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton timeButton = new JButton("DisplayTime");
		JButton countButton = new JButton("Count");

		timeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DigitalWatch d = new DigitalWatch();
				d.start();
//				d.run();
			}

		});

		countButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Counter c =new Counter();
				c.start();
			}
		});

		panel.add(timeButton);
		panel.add(countButton);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		HomeFrame h = new HomeFrame();
	}

	
	

}
