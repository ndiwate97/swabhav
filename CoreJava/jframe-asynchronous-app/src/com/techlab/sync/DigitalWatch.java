package com.techlab.sync;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalWatch  extends Thread {
	public void run() {
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
}