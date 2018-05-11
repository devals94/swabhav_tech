package com.techlabs.student.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.student.Student;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<Student>();
		Student student1 = new Student(100101, "Rahul", 100);
		Student student2 = new Student(100102, "Sachin", 101);
		Student student3 = new Student(100103, "Warner", 102);
		Student student4 = new Student(100104, "Kevin", 103);
		Student student5 = new Student(100105, "Ricky", 104);
		System.out.println("New List of Students: ");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		printStudentDetails(studentList);
		System.out.println("\n" + "Student List After Updation: ");
		studentList.set(0, student4);
		printStudentDetails(studentList);
		
		System.out.println("\n" + "Student List After Deletion ");
		studentList.remove(3);
		printStudentDetails(studentList);

	}

	public static void printStudentDetails(List<Student> student) {
		for (Student stud : student) {
			System.out.println("Id : " + stud.getId());
			System.out.println("Name: " + stud.getName());
			System.out.println("RollNo : " + stud.getRollNo());
			System.out.println();
		}

	}
}
