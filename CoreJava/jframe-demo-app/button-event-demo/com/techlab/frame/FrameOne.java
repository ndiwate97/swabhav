package com.techlab.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrameOne {

	public FrameOne() {
		frameOne();
	}

	public void frameOne() {

		JFrame frameOne = new JFrame();
		JPanel panelOne = new JPanel();
		JButton helloButton = new JButton("Hello");

		helloButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameTwo();
			}

		});

		panelOne.add(helloButton);
		frameOne.add(panelOne);
		frameOne.setSize(200, 300);
		frameOne.setVisible(true);

	}

}
