package com.techlab.collection.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

//			add elements 

		list.add("ElementOne");
		list.add("ElementTwo");

//			push() : pushes an element onto the stack represented by a list.
		list.push("ElementThree");
		list.push("ElementFour");

//			size() : gives length of list
//			get() : To access an element 

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

//			set() : To modify an element

		list.set(0, "UpdatedElement");
		System.out.println("\nAfter updating 0th element : " + list.get(0));

//			remove() : To remove an element

		list.remove(1);

//			pop() : pops an element from the stack represented by a list.

		list.pop();

//			display using Iterator
		System.out.println("\nAfter remove(1) and pop() :");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
