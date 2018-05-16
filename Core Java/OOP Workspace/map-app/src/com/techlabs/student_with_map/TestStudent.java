package com.techlabs.student_with_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestStudent {
	public static void main(String[] args) {
		Map<Integer, Student> student = //new HashMap<Integer, Student>();
				//new LinkedHashMap<Integer, Student>();
				new TreeMap<Integer, Student>();
		student.put(12, new Student("Wiley", 1001, 58));
		student.put(32, new Student("Salman", 1002, 98));
		student.put(93, new Student("David", 1005, 35));
		student.put(84, new Student("Rana", 1010, 59));
		student.put(55, new Student("Marsh", 1025, 48));
		student.put(16, new Student("Simon", 1004, 64));

		for (Integer key : student.keySet()) {
			System.out.println(key + " " + student.get(key).getName() + " " + student.get(key).getId() + " " + student.get(key).getMarks());
		}
	}
}
