package com.inheritance.man;

public class Boy extends Man {
	@Override
	public void play() {
		System.out.println("Boy is playing.");
	}

	public void walk() {
		System.out.println("Boy is walking");
	}

	public void eat() {
		System.out.println("Boy is eating");
	}
}
