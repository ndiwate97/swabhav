package com.techlab.violation;

public class TaxCalculation {

	LogType log;

	public TaxCalculation(LogType log) {
		this.log = log;
	}

	public LogType getLog() {
		return log;
	}

	public int calculate(int amount, int rate) {
		
		int r = 0;
		try {
			r = amount / rate;
			return r;
		} catch (Exception e) {
			if (this.getLog() == LogType.TXT) {
				TxtLogger.log(e.getMessage());
				return -1;
			} else {
				XmlLogger.log(e.getMessage());
				return -1;
			}
		}
		
		
	}
}
