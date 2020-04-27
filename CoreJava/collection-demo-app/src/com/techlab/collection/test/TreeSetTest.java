package com.techlab.collection.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {

		TreeSet<String> tset=new TreeSet<String>();

//		add elements 

		tset.add("ElementOne");
		tset.add("ElementTwo");
		tset.add("ElementThree");
		tset.add("ElementFour");
		
//		display using for each
		
		for (String s : tset) {
			System.out.println(s);
		}
		
		
//		get highest value and remove that
		System.out.println("\nHighest Value: "+tset.pollFirst());
		
//		get lowest value and remove that
		System.out.println("\nLowest Value: "+tset.pollLast());
		
//		remove element
		tset.remove("ElementOne");

//		display using Iterator
		System.out.println("\nAfter all remove operations:");
		Iterator<String> itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
