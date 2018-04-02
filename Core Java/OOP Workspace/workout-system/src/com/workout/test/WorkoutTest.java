package com.workout.test;

import com.techlabs.person_details.GenderType;
import com.techlabs.person_details.Person;

public class WorkoutTest {
	public static void main(String[] args) {
		Person person = new Person("Deval", GenderType.MALE, 24, 162, 70);
		System.out.println("Before");
		displayWorkout(person);

		person.workout(3);
		System.out.println("\nAfter");
		displayWorkout(person);
		
		person.eat(4);
		System.out.println("\nAfter");
		displayWorkout(person);
		
		person.workout(3);
		System.out.println("\nAfter");
		displayWorkout(person);
		
	}

	public static void displayWorkout(Person per) {
		System.out.println("Weight  : " + per.getWeight());
		System.out.println("Height  : " + per.getHeight());
		System.out.println("BMI :" + per.BMI());
		System.out.println("Health Category: " + per.BMICategory());
	}
}
