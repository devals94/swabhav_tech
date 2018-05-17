package com.techlabs.student_with_set;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student marks1, Student marks2) {
		if (marks1.equals(marks2.getName())) {

			return 0;
		} else {
			if (marks1.getMarks() < marks2.getMarks()) {

				return 1;
			} else if (marks1.getMarks() > marks2.getMarks()) {

				return -1;
			} else
				return marks1.getName().compareTo(marks2.getName());
		}
	}
}
