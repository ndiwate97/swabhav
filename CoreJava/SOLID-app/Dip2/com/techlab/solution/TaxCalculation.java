package com.techlab.solution;

public class TaxCalculation  {

	private ILogError log;

	public TaxCalculation(ILogError log) {
		this.log = log;
	}

	public ILogError getLog() {
		return log;
	}

	public int calculate(int amount, int rate) {
		
		int r = 0;
		try {
			r = amount / rate;
			return r;
		} catch (Exception e) {
			log.LogError(e.getMessage());
			return -1;
		}
		
		
	}
}
