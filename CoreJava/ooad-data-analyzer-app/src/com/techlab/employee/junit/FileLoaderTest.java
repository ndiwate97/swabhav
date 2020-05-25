package com.techlab.employee.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.employee.DataAnalyzer;
import com.techlab.employee.FileLoader;
import com.techlab.employee.ILoadAble;
import com.techlab.employee.UrlLoader;

public class FileLoaderTest {

	@Test
	public void testLoadData() throws Exception {
		//Arrange
				int expectedArrayLength= 14;
				
				//Act
				DataAnalyzer d = new DataAnalyzer();
				
				String path = "..\\mini-proj-data-analyzer-app\\src\\dataFile_emp.txt";
				ILoadAble dataLoader = new FileLoader();
				dataLoader.loadData(path, d);
				
				//Assert
				
				assertEquals(expectedArrayLength, d.getEmployees().size());
	}

}
