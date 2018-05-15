package com.techlabs.menu;

public class Contact {
	private String name;
	private int number;

	public Contact(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void menuList() {
		System.out.println("Welcome to the Menu!");
		System.out.println("1.Add Contact Name and Number");
		System.out.println("2.Display Contact Name and Number");
		System.out.println("3.Exit Menu");
		System.out.println("Please input a number");
	}
	
	
}
