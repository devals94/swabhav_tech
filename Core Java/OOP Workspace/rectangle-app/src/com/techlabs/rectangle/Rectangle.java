package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;

	public int calArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = convertToAValidDimension(width);
	}

	public void setHeight(int height) {
		this.height = convertToAValidDimension(height);
	}

	private int convertToAValidDimension(int value) {
		if (value < 0) {
			return 1;
		}
		if (value > 100) {
			return 100;
		}
		return value;
	}
}
