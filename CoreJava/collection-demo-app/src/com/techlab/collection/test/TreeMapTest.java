package com.techlab.collection.test;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

//		put(Object key, Object value) : insert an entry in the map
		tm.put(100, "Value1");
		tm.put(101, "Value2");
		tm.put(102, "Value3");

		System.out.println("Initial list of elements: " + tm);

//			 replace(K key, V value) : update element
		tm.replace(100, "Value0");

//			 remove(Object key) : delete an entry for the specified key.
		tm.remove(101);

		System.out.println("\nAfter update and remove list of elements: " + tm);
	}

}
