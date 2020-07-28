package com.techlab.linklist;

public class Node<T> {
	private T data;
	private Node<T> next;

	public T getData() {
		T nextdata= (T) "";
//		System.out.println(data);
		if(next!=null) {
			nextdata = next.getData();
		}
		return (T) (data + " " +nextdata);	
		
	}
	

	public void setData(T data) {
		this.data=data;
	}

	public Node<T> getNext() {
		return next;		
	}

	public void setNext(Node<T> node) {
		this.next=node;
	}
}