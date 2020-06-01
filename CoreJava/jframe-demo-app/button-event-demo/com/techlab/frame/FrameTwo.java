package com.techlab.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTwo {
	
	public FrameTwo(){
		frameTwo();
	}

	public void frameTwo() {
		JFrame frameTwo = new JFrame();
		JPanel panelTwo = new JPanel();
		JButton hello = new JButton("Namrata");

		panelTwo.add(hello);
		frameTwo.add(panelTwo);
		frameTwo.setSize(200, 300);
		frameTwo.setVisible(true);
	}
}