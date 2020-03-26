package com.techlab.immutable.test;

public class StringImmutableTest {

	public static void main(String[] args) {
		
		String name = "Namrata";
		System.out.println("Name is "+name.hashCode());
		System.out.println(name.toUpperCase().hashCode());
		System.out.println(name.toLowerCase().hashCode());
		name = "new name";
		System.out.println(name.hashCode());
	}

}
