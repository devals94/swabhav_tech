package com.techlabs.player;

public class Player {
	private static int id = 1001;
	private String name;
	private int age;
	private int generated = id;

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getId() {
		if (isIdAlreadyGenerated()) {
			return generated;
		}
		return id++;
	}

	private boolean isIdAlreadyGenerated() {
		if (id == generated) {
			return false;
		}
		return true;
	}
}
