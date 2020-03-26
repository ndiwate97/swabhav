package com.techlab.immutable.test;

public class StringCompareDemo {

	public static void main(String[] args) {
		
		String str1="demo";
		String str2="demo";
		String str3="Test";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		//comparison operator
		
		System.out.println((str1==str2));
		System.out.println((str1==str3));


		System.out.println((str1.equals(str2)));
		System.out.println((str1.equals(str3)));


	}

}
