package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class CollegeTest {
	public static void main(String[] args) {
		List<Professor> professors = new ArrayList<Professor>();
		List<Student> students = new ArrayList<Student>();

		College college = new College();
		college.addStudent(new Student(101, "Mumbai", "20-10-1994", Branch.COMPS));
		college.addStudent(new Student(102, "Pune", "19-01-1998", Branch.INFT));
		college.addStudent(new Student(103, "Udaipur", "21-05-1996", Branch.EXTC));
		college.addProfessor(new Professor(1001, "Nagpur", "10-03-1985", 7));
		college.addProfessor(new Professor(1002, "Delhi", "22-08-1970", 8));
		college.addProfessor(new Professor(1003, "Kolkata", "28-07-1988", 9));

		professors = college.displayAllProfessors();
		students = college.displayAllStudents();

		System.out.println("Total Students:" + students.size());
		for (Student s : students) {
			System.out.print("ID:" + s.getId());
			System.out.print("\tAddress:" + s.getAddress());
			System.out.print("\tDOB:" + s.getDateOfBirth());
			System.out.print("\tBranch:" + s.getBranch() + "\n");
		}
		System.out.println("\nTotal Professors:" + professors.size());
		
		for (Professor p : professors) {
			System.out.print("ID:" + p.getId());
			System.out.print("\tAddress:" + p.getAddress());
			System.out.print("\tDOB:" + p.getDateOfBirth());
			System.out.print("\tWorking Hours:" + p.getNoOfHoursWorked());
			System.out.println("\tSalary:" + p.calculateSalary(professors));
		}

	}
}
