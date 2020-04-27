package com.techlab.collection.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
//		add elements 
		
		list.add("ElementOne");
		list.add("ElementTwo");
		list.add("ElementThree");
		list.add("ElementFour");
		
//		size() : gives length of list
//		get() : To access an element 
		
		for (int i = 0; i < list.size(); i++) {
		      System.out.println(list.get(i));
		    }
		
//		set() : To modify an element
		
		list.set(0, "UpdatedElement");
		System.out.println("\nAfter updating 0th element : "+list.get(0));
		
//		remove() : To remove an element
		
		list.remove(1);
		
//		sort() : sorting lists alphabetically or numerically.
		Collections.sort(list); 
		
//		display using for each
		System.out.println("\nList after sorting:");
		for (String i : list) {
		      System.out.println(i);
		    }
	}
}
