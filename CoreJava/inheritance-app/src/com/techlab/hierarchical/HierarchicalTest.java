package com.techlab.hierarchical;

public class HierarchicalTest {
	
	public static void main(String[] args) {
		
		ChildOne c1 = new ChildOne();
		c1.childOneMessage();
		c1.parentMessage();
		
		ChildTwo c2 = new ChildTwo();
		c2.childTwoMessage();
		c2.parentMessage();
		
	}

}
