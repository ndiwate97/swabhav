package com.techlab.linklist.test;

import com.techlab.linklist.Node;

public class LinklistTest {

	public static void main(String[] args) {
		
		Node<Integer> first = new Node<Integer>();
		Node<Integer> mid = new Node<Integer>();
		Node<Integer> last = new Node<Integer>();
		
		
		first.setData(10);
		first.setNext(mid);	
		
		mid.setData(20);
		mid.setNext(last);
		
		last.setData(30);
		last.setNext(null);
		
//		first.getData();
		System.out.println(first.getData());
		
	}
}

