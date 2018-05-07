package com.techlabs.circle.unittest;

import org.junit.Assert;
import org.junit.Test;

import com.techlabs.circle.Circle;

public class CircleUnitTest {

	Circle circle;

	@Test
	public void shouldReturnDefaultRadiusIfGreaterThanOneOrLessThanEqualToZero() {
		circle = new Circle(0, "");
		float expectedRadius = 0.1f;
		float actualRadius = circle.getRadius();
		System.out.println(actualRadius);
		Assert.assertTrue(expectedRadius == actualRadius);
	}

	@Test
	public void shouldReturnDefaultColorIfNotRedGreenBlue() {
		circle = new Circle(1, "Orange");
		String expectedColor = "Red";
		String actualColor = circle.getColor();
		Assert.assertTrue(expectedColor == actualColor);
	}

	
}
