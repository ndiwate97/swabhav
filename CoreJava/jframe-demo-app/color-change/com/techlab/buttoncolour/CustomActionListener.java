package com.techlab.buttoncolour;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class CustomActionListener implements ActionListener {

	JPanel panel;
	Color c ;

	public CustomActionListener(JPanel panel, Color c) {
		this.panel = panel;
		this.c=c;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (panel.getBackground() == c) {
			panel.setBackground(null);
		} else {
			panel.setBackground(c);
		}

	}

}
