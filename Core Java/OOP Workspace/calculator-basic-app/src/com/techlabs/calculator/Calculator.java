package com.techlabs.calculator;

public class Calculator {

	public int add(int number1, int number2) {
		if (number1 <= 0 || number2 <= 0) {
			throw new IllegalArgumentException();
		} else
			return number1 + number2;
	}

	public double cubeEven(int number) {
		if (number > 0 && number % 2 == 0) {
			return number * number * number;

		} else
			throw new IllegalArgumentException();
	}
}
