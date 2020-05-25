package com.techlab.solution;

public class XmlLogger implements ILogError{
	
	@Override
	public void LogError (String error) {
		System.out.println("Writting to XML file...");
		System.out.println(error);
	}

}
