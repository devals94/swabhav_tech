/*
 * Problem Statement:
 * id field should not change the value once assigned but the values need to be auto incremented for instances of different objects.
 * */
package com.techlabs.player;

public class PlayerNew {
	private static int nextID = 1000;
	private final int id;
	private int age;
	private String name;

	public PlayerNew(String name, int age) {
		this.age = age;
		this.name = name;
		this.id = ++nextID;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "id: " + this.id + "\n" + "name: " + this.name + "\n" + "age: "
				+ this.age + "\n" + super.toString();
	}
}
