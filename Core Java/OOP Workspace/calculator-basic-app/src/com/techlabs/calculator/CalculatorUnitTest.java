package com.techlabs.calculator;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorUnitTest {

	Calculator cal = new Calculator();

	@Test
	public void shouldAddPositiveValues() {
		// Arrange
		int expectedValue1 = 30;
		double expectedValue2 = 64;

		// Act
		int actualValue1 = cal.add(10, 20);
		double actualValue2 = (int) cal.cubeEven(4);

		// Assert
		Assert.assertEquals(expectedValue1, actualValue1);
		Assert.assertEquals(expectedValue2, actualValue2, 0);
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void throwsExceptionWhenNegativeNumbersAreGiven() {
		// arrange
		thrown.expect(IllegalArgumentException.class);
		// act
		cal.add(-1, -2);
		cal.cubeEven(-1);
	}

	@Test
	public void throwsExceptionWhenZeroIsGivenAsNumber() {
		// arrange
		thrown.expect(IllegalArgumentException.class);

		// act
		cal.add(0, 0);
		cal.cubeEven(0);
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void throwsExceptionWhenNegativeNumbers() {
		cal.add(-1, -2);
		cal.cubeEven(-1);
	}
}
