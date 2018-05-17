package com.techlabs.student_with_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) throws ClassCastException {
		MarksComparator marksCompare = new MarksComparator();
		Set<Student> student=// new HashSet<Student>();
				//new LinkedHashSet<Student>();
				new TreeSet<Student>(marksCompare);
		student.add(new Student ("Raj", 7, 45));
		student.add(new Student ("Monty", 20, 95));
		student.add(new Student ("Manoj", 10, 50));
		student.add(new Student ("Suresh", 12, 65));
		student.add(new Student ("David", 22, 45));
		student.add(new Student ("Maggi", 2, 95));
		student.add(new Student ("Raj", 7, 45));
		displayStudents(student);
		
	}
	
	public static void displayStudents(Set<Student> classmates){
		for(Student friends: classmates){
			System.out.println("Name: " + friends.getName()+ ", Id: "+friends.getId() + ", Marks: " + friends.getMarks());
		}
	}
	
	
}

