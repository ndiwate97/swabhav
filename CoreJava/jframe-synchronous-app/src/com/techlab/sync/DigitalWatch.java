package com.techlab.sync;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalWatch implements Runnable {
	
	JPanel watchPanel = new JPanel();
	Thread t = new Thread(this);
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	JLabel timeLable = new JLabel();

	DigitalWatch() {
		
		t.start();

		watchPanel.add(timeLable);
		
	}

	public void run() {
		try {
			while (true) {

				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if (hours > 12)
					hours -= 12;
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);

				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				timeString = formatter.format(date);

				printTime();

				t.sleep(1000); // interval given in milliseconds
			}
		} catch (Exception e) {
		}
	}

	public void printTime() {
		timeLable.setText(timeString);
	}

	
}