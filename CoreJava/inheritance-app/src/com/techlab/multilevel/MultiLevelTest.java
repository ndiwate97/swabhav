package com.techlab.multilevel;

public class MultiLevelTest {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.childMessage();
		c.parentMessage();
		c.superParentMessage();
	}
}
