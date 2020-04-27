package com.techlab.collection.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

//		put(Object key, Object value) : insert an entry in the map
		lhm.put(100, "Value1");
		lhm.put(101, "Value2");
		lhm.put(102, "Value3");

		System.out.println("Initial list of elements: " + lhm);

//		 replace(K key, V value) : update element
		lhm.replace(100, "Value0");

//		 remove(Object key) : delete an entry for the specified key.
		lhm.remove(101);

		System.out.println("\nAfter update and remove list of elements: " + lhm);

	}

}
