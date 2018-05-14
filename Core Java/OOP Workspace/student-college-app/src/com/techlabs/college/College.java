package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class College {

	private List<Student> students = new ArrayList<Student>();
	private List<Professor> professors = new ArrayList<Professor>();

	public void addStudent(Student newstudent) {
		students.add(newstudent);
	}

	public void addProfessor(Professor newprofessor) {
		professors.add(newprofessor);
	}

	public List<Student> displayAllStudents() {
		return students;
	}

	public List<Professor> displayAllProfessors() {
		return professors;
	}
}
