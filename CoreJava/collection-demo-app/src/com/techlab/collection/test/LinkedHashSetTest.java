package com.techlab.collection.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		 LinkedHashSet<String> set=new LinkedHashSet<String>();  
		 

//			add elements 

			set.add("ElementOne");
			set.add("ElementTwo");
			set.add("ElementThree");
			set.add("ElementFour");

//			display using Iterator
			Iterator<String> itr = set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

//			remove() : To remove an element
			set.remove("ElementOne");
			
//			display using for each
			System.out.println("\nAfter remove(1):");
			for (String s : set) {
				System.out.println(s);
			}

		 
		 
	}

}
