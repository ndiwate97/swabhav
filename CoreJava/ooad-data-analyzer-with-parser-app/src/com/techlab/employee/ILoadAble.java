package com.techlab.employee;

import java.util.ArrayList;

public interface ILoadAble {

	public ArrayList<String> loadData() throws Exception ;
	
	public void setSource(String path); 
}
