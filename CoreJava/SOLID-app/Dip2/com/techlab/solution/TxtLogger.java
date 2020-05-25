package com.techlab.solution;

public class TxtLogger implements ILogError {

	@Override
	public  void LogError (String error) {
		System.out.println("Writting to txt file...");
		System.out.println(error);
	}

}
