package com.techlab.employee.junit;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import com.techlab.employee.DataAnalyzer;
import com.techlab.employee.ILoadAble;
import com.techlab.employee.UrlLoader;

public class UrlLoaderTest {

	@Test
	public void testLoadData() throws Exception {
		
		//Arrange
		int expectedArrayLength= 14;
		
		//Act
		DataAnalyzer d = new DataAnalyzer();
		String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
		ILoadAble dataLoader = new UrlLoader();
		dataLoader.loadData(url, d);
		
		//Assert
		
		assertEquals(expectedArrayLength, d.getEmployees().size());
		
	}

}
