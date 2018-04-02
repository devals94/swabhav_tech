package com.techlabs.rectangleconst;

public class Rectangle {
	private int width;
	private int height;
	private BorderStyleType borderstyle;

	public Rectangle(int width, int height) {
		this(width, height, BorderStyleType.SINGLE_LINE);
	}

	public Rectangle(int width, int height, BorderStyleType borderstyle) {
		this.width = width;
		this.height = height;
		this.borderstyle = borderstyle;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public BorderStyleType getBorderStyle() {
		return this.borderstyle;
	}

	public int calArea() {
		return getWidth() * getHeight();
	}

	public Rectangle whoIsBig(Rectangle r) {
		if ((this.calArea()) > (r.calArea()))
			return this;
		else
			return r;
	}
}
