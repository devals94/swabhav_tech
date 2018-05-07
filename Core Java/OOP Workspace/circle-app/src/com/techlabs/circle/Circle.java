package com.techlabs.circle;

public class Circle {
	private float radius = 0.1f;
	private String color = "Red";

	public Circle(float radius, String color) {
		if ((radius > 0
				&& radius <= 1)
				&& (color.equalsIgnoreCase("red")
						|| color.equalsIgnoreCase("green") || color
							.equalsIgnoreCase("blue"))) {
			this.radius = radius;
			this.color = color;
			return;
		} else
			System.err
					.println("Number 0 not allowed.Enter number between 0 and 1");
	}

	public float getRadius() {
		return this.radius;
	}

	public float calculatePerimeter() {
		float perimeter = 2 * (float) Math.PI * getRadius();
		return perimeter;
	}

	public float calculateArea() {
		float area = (float) Math.PI * getRadius() * getRadius();
		return area;
	}

	public String getColor() {
		return this.color;
	}
}
