package com.techlabs.student;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private int rollNo;
	private static String collegeName = "Witty";

	public Student(int id, String name, int rollNo) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getRollNo() {
		return this.rollNo;
	}
}
