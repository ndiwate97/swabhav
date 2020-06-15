package com.techlab.sync;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Counter  extends Thread {
	public void run() {

		int count = 0;
		
		while (true) {
			count++;
			System.out.println("Counter : "+ count);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}	
}