package com.techlabs.constructor;

public class Parent {
	private int foo;
	public Parent(int foo){
		System.out.println("A is created");
		this.foo = foo;
	}
	public int getFoo() {
		return foo;
	}
	
	
}
