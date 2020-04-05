package com.techlab.file.operations;
import java.io.File;
import java.util.Scanner;

public class SkipNullOrZero {
	public static void main(String[] args) throws Exception  
	{  
	Scanner sc = new Scanner(new File("C:\\swabhav\\CoreJava\\file-input-output-app\\Student.csv"));  
	sc.useDelimiter(",");
	
	
	while (sc.hasNext())  
	{  
		String s = sc.next();
//		System.out.println("\n before if this is s: "+s);
		if(!s.equalsIgnoreCase("null") &&  !s.equals("0"))
			System.out.print(s+" ");  
	}   
	sc.close();
	}  

}
/*
 *output: 
23 female
102 xyz 21 male
103 pqr 29 male
104 30 female 
*/
