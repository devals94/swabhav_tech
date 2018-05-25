package com.lsp.violation;

public class TestLspViolation {
	public static void main(String[] args) {
		shouldNotChangeHeightIfWidthIsChanged(new Rectangle(10, 30));
		shouldNotChangeHeightIfWidthIsChanged(new Rectangle(10, 5));
		shouldNotChangeHeightIfWidthIsChanged(new Square(5));
	}

	public static void shouldNotChangeHeightIfWidthIsChanged(Rectangle r) {
		int beforeHeight = r.get_height();
		r.set_width(40);
		int afterHeight = r.get_height();
		System.out.println("Height Before width is changed: " + beforeHeight);
		System.out.println("Height After width is changed: " + afterHeight);
		System.out.println("Area: " + r.calculateArea()); 
		System.out.println();
	}
}
