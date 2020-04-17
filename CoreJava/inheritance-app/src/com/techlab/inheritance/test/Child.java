package com.techlab.inheritance.test;

public class Child extends Base{
	static int bar =20;
	public Child()
	{
	super(bar);
	System.out.println("hi inside child const");
	}
}
