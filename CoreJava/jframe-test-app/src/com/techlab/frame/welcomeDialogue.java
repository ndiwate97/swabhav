package com.techlab.frame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.techlab.frame.test.TestClass;

public class welcomeDialogue {

	public welcomeDialogue(String text) {
		JDialog d = new JDialog();
		
		JPanel p = new JPanel();

		JLabel l = new JLabel();

		l.setText("Welcome " +text);
		
		p.add(l);
		d.add(p);
		d.setSize(200, 200);
		d.setVisible(true);
		d.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				WelcomeScreen.frame.dispose();
			}
		});

	}

}
