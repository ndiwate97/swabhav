package com.headfirst.chapter2;

public class DrumKitTestDrive {

	public static void main(String [] args) {
		int x=0;
		DrumKit d = new DrumKit();
		
	/*	d.playSnare();
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();*/

//		case 1:
	/*	
		while(x<4) {
			if(x<2)
				d.topHat=false;
			else {
				d.topHat=true;
				d.snare=false;
			}
			if (d.snare == true) 
				d.playSnare();
			else
				d.playTopHat();
			x++;
		}*/
		
//		case 2:
	/*	while(x<4) {
			
			if (d.snare == true) 
				d.playSnare();
			else 
				d.playTopHat();
			d.snare=!d.snare;
			x++;
		}*/
		
//		case 3:
		while(x<7) {
			if(x<3) 
				d.snare=false;
			else
				if(x<5)
					d.snare=true;
				else
					d.snare=!d.snare;
			
			
			if (d.snare == true) 
				d.playSnare();
			else 
				d.playTopHat();
			
			x++;
		}
	}

}

/*
 * s-b p-d case 1: bang bang 2times and ding ding 2times case 2: it should get
 * printed in alternate sequence: b d b d case 3: ddd bb db
 */
