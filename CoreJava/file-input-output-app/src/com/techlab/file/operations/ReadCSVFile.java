package com.techlab.file.operations;

import java.io.File;
import java.util.*;

public class ReadCSVFile {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\swabhav\\CoreJava\\file-input-output-app\\Student.csv"));
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			System.out.print(sc.next() + " ");
		}
		sc.close();
	}

}
//output:
/*
 * 101 namrata 23 female 102 xyz 21 male 103 pqr 29 male 104 abc 30 female
 */