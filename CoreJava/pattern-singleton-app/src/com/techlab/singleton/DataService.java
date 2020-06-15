package com.techlab.singleton;

public class DataService {

	private static DataService bucket;
	
	private DataService() {
		System.out.println("Service Created");
	}
	
	public static DataService getInstance() {
		if(bucket==null) {
			bucket = new DataService();
		}
		return bucket;
	}
	
	public void processData() {
		System.out.println("Hash Code of current Data Service is " +this.hashCode());
	}
}
