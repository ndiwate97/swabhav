package com.techlab.collection.test;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

//		put(Object key, Object value) : insert an entry in the map
		hm.put(100, "Value1");
		hm.put(101, "Value2");
		hm.put(102, "Value3");

		System.out.println("Initial list of elements: " + hm);

//		putIfAbsent(K key, V value) : 
		hm.putIfAbsent(103, "Value1");

//		 replace(K key, V value) : update element
		hm.replace(100, "Value0");

//		 remove(Object key) : delete an entry for the specified key.
		hm.remove(101);

		System.out.println("\nAfter update and remove list of elements: " + hm);
	}
}