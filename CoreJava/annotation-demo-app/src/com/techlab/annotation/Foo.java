package com.techlab.annotation;

import java.lang.annotation.*;

public abstract  class Foo implements RequireRefactor {
	public void greet() {
		System.out.println("Hello");
	}

	@RequireRefactor
	public void go() {
		System.out.println("bye");
	}

	public void play() {
		System.out.println("Playing");
	}

	@RequireRefactor
	public void dance() {
		System.out.println("dancing");
	}
	
}

