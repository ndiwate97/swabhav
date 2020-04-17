package com.techlab.custom.annotation;

import java.io.Serializable;

public abstract class Foo implements Test , Serializable {
	
	public boolean m1() {
		return true;
	}
	
	

	@Test
	public boolean m2() {
		return true;
	}
    
	@Test
	public boolean m3() {
		return true;
	}

	@Test
	public boolean m4() {
		return true;
	}

}
