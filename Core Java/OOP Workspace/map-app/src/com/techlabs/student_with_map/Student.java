package com.techlabs.student_with_map;

public class Student {
	private String name;
	private int id;
	private float marks;

	public Student(String name, int id, float marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getMarks() {
		return marks;
	}
}
