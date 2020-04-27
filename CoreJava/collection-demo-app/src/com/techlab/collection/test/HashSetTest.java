package com.techlab.collection.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();

//		add elements 

		hset.add("ElementOne");
		hset.add("ElementTwo");
		hset.add("ElementThree");
		hset.add("ElementFour");

//		display using Iterator
		Iterator<String> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		remove() : To remove an element

		hset.remove("ElementOne");
		
		System.out.println("\nAfter remove(1):");
		
//		display using foreach
		for (String s : hset) {
			System.out.println(s);
		}

	}

}
