package com.techlabs.array;

public class TestMutate {
	public static void main(String[] args) {
		int mark = 100;
		mutateMark(mark);
		System.out.println(mark);

		int[] marks = { 10, 20, 30, 40, 50 };
		mutateMarks(marks);
		for(int displayMarks: marks){
			System.out.println(displayMarks);
		}
	}

	private static void mutateMarks(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 23;
		}
	}

	private static void mutateMark(int m) {
		m = 20;
	}
}
