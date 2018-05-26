package com.lsp.solution.test;

import com.lsp.solution.Rectangle;

public class TestLspSolution {
	public static void main(String[] args) {
		shouldNotChangeHeightIfWidthIsChanged(new Rectangle(10, 30));
		shouldNotChangeHeightIfWidthIsChanged(new Rectangle(10, 5));
		//shouldNotChangeHeightIfWidthIsChanged(new Square(5));//This line should not be passed.
	}

	public static void shouldNotChangeHeightIfWidthIsChanged(Rectangle r) {
		int beforeHeight = r.getHeight();
		r.setWidth(40);
		int afterHeight = r.getHeight();
		System.out.println("Height Before width is changed: " + beforeHeight);
		System.out.println("Height After width is changed: " + afterHeight);
		System.out.println("Area: " + r.calculateArea()); 
		System.out.println();
	}
}
