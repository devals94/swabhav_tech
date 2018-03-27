package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTestDrive {
	public static void main(String[] args) {
		shouldTestHeightWithNegativeValue();
		shouldTestHeightWithPositiveValue();
		shouldTestHeightWithPositiveValueAbove100();
		shouldTestWidthWithNegativeValue();
		shouldTestWidthWithPositiveValue();
		shouldTestWidthWithPositiveValueAbove100();
	}

	private static void shouldTestWidthWithPositiveValueAbove100() {
		Rectangle rectangle;
		rectangle = new Rectangle();
		rectangle.setWidth(180);
		System.out.println("Width = " + rectangle.getWidth());

		int expectedValue = 100;
		int actualValue = rectangle.getWidth();

		if (expectedValue == actualValue) {
			System.out.println("Test Width with Positive Value Above 100 passed.");
			return;
		}
		System.out.println("Test Width with Positive Value Above 100 Failed.");
	}

	private static void shouldTestWidthWithPositiveValue() {
		Rectangle rectangle;
		rectangle = new Rectangle();
		rectangle.setWidth(80);
		System.out.println("Width = " + rectangle.getWidth());

		int expectedValue = 80;
		int actualValue = rectangle.getWidth();

		if (expectedValue == actualValue) {
			System.out.println("Test Width with Positive Value passed.");
			return;
		}
		System.out.println("Test Width with Positive Value Failed.");
	}

	private static void shouldTestWidthWithNegativeValue() {
		Rectangle rectangle;
		rectangle = new Rectangle();
		rectangle.setWidth(-150);
		System.out.println("Width = " + rectangle.getWidth());

		int expectedValue = 1;
		int actualValue = rectangle.getWidth();

		if (expectedValue == actualValue) {
			System.out.println("Test Width with Negative Value passed.");
			return;
		}
		System.out.println("Test Width with Negative Value Failed.");
	}

	private static void shouldTestHeightWithPositiveValueAbove100() {
		Rectangle rectangle;
		rectangle = new Rectangle();
		rectangle.setHeight(150);
		System.out.println("Height = " + rectangle.getHeight());

		int expectedValue = 100;
		int actualValue = rectangle.getHeight();

		if (expectedValue == actualValue) {
			System.out.println("Test Height with Positive Value Above 100 passed.");
			return;
		}
		System.out.println("Test Height with Positive Above 100 Value Failed.");
	}

	private static void shouldTestHeightWithPositiveValue() {
		Rectangle rectangle;
		rectangle = new Rectangle();
		rectangle.setHeight(15);
		System.out.println("Height = " + rectangle.getHeight());

		int expectedValue = 15;
		int actualValue = rectangle.getHeight();

		if (expectedValue == actualValue) {
			System.out.println("Test Height with Positive Value passed.");
			return;
		}
		System.out.println("Test Height with Positive Value Failed.");
	}

	private static void shouldTestHeightWithNegativeValue() {
		Rectangle rectangle;
		rectangle = new Rectangle();
		rectangle.setHeight(-150);
		System.out.println("Height = " + rectangle.getHeight());

		int expectedValue = 1;
		int actualValue = rectangle.getHeight();

		if (expectedValue == actualValue) {
			System.out.println("Test Height with Negative Value passed.");
			return;
		}
		System.out.println("Test Height with Negative Value Failed.");
	}
}
