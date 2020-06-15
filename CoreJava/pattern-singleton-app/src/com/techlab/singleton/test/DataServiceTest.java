package com.techlab.singleton.test;

import com.techlab.singleton.DataService;

public class DataServiceTest {
	
	public static void main(String[] args) {
		
		DataService d1 = DataService.getInstance();
		DataService d2 = DataService.getInstance();
		
		System.out.println("d1 Hash code : "+d1.hashCode());
		System.out.println("d2 Hash code : "+d2.hashCode());
		
		d1.processData();
		d2.processData();
	}

}
