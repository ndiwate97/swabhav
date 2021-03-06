package com.techlab.adapter.test;

import com.techlab.adapter.*;

public class AdapterTest {
	
	public static void main(String[] args) {
		IQueue<Integer> q = new QueueAdapter<Integer>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		System.out.println(q.count());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.count());
		
		q.enqueue(20);
		q.enqueue(30);
		
		for (int e : q) {
			System.out.println(e);
		}
	}

}
