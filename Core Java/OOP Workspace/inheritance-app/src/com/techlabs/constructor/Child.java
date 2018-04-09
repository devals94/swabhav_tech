package com.techlabs.constructor;


public class Child extends Parent {
	public Child() {
		super(100);
		System.out.println("B is created");
	}
	
	public Child(int foo){
		super(foo);
	}
}
