package com.headfirst.chapter4;

public class Puzzel4 {
	public static void main(String [] args) {
		Puzzel4b [ ] obs = new Puzzel4b[6];		//___________________________________
		int y = 1;
		int x = 0;
		int result = 0;
		while (x < 6) {
			obs[x] = new Puzzel4b( );		//___________________________
			obs[x] . ivar = y;				//___________________________
		y = y * 10;
		x = x + 1;//_________________
		}
		x = 6;
		while (x > 0) {
			x = x - 1;//_________________
		result = result + obs[x].doStuff(x); //___________________
		}
		System.out.println("result " + result);
		}

}
