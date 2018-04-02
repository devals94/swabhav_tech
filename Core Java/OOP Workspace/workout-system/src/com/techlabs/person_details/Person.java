package com.techlabs.person_details;

public class Person {
	private String name;
	private GenderType gender;
	private int age;
	private float height;
	private float weight;

	public Person(String name, GenderType gender, int age, int height,
			int weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void workout(int hours) {
		if (hours > 8) {
			this.weight = this.weight - 3.0f;
			this.height = this.height + 1.5f;
			return;
		}
		 if (hours > 1 && hours <= 8) {
			this.weight = this.weight - 1.5f;
			this.height = this.height + 1.0f;
		}
	}

	public void eat(int noOfMeals) {
		if (noOfMeals >= 3) {
			this.weight = this.weight + 3.5f;
			return;
		}
		if (noOfMeals > 0 && noOfMeals < 3) {
			this.weight = this.weight + 1.5f;
		}
	}

	public float getHeight() {
		return this.height;
	}

	public float getWeight() {
		return this.weight;
	}

	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public GenderType getGender(){
		return this.gender;
	}
	
	public float BMI(){
		return (getWeight()/(getHeight()*getHeight()))*10000;
	}
	
	public String BMICategory(){
		if(BMI()<18.5f){
			return "Underweight";
		}
		if(BMI()>=18.5f && BMI()<=24.9f){
			return "Normal Weight";
		}
		if(BMI()>24.9f && BMI()<=29.9f){
			return "Overweight";
		}
		return "Obese";
	}
}
