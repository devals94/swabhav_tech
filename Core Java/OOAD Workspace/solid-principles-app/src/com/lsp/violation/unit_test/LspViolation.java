package com.lsp.violation.unit_test;

import org.junit.Assert;
import org.junit.Test;

import com.lsp.violation.Rectangle;
import com.lsp.violation.Square;

public class LspViolation {
	
	@Test
	public void testWithRectangle() {
		Rectangle rect1 = new Rectangle(10, 30);
		rect1.set_width(40);
		rect1.set_height(10);
		System.out.println(rect1.calculateArea());
		Assert.assertEquals(400,rect1.calculateArea());//This assert passes.
	}
	
	@Test
	public void testWithSquare() {
		Square square = new Square(5);
		square.set_width(40);
		square.set_height(10);
		System.out.println(square.calculateArea());
		Assert.assertEquals(400,square.calculateArea());//This assert fails.
	}

	
	@Test
	public void rectangleShouldNotChangeHeightIfWidthIsChanged() {
		Rectangle r = new Rectangle(10, 30);
		int beforeHeight = r.get_height();
		r.set_width(40);
		int afterHeight = r.get_height();
		System.out.println("Height Before width is changed: " + beforeHeight);
		System.out.println("Height After width is changed: " + afterHeight);
		System.out.println("Area: " + r.calculateArea()); 
		Assert.assertEquals(beforeHeight, afterHeight);//This assert passes.
		System.out.println();
	}
	
	@Test
	public void squareShouldNotChangeHeightIfWidthIsChanged() {
		Square square = new Square(5);
		int beforeHeight = square.get_height();
		square.set_width(40);
		int afterHeight = square.get_height();
		System.out.println("Height Before width is changed: " + beforeHeight);
		System.out.println("Height After width is changed: " + afterHeight);
		System.out.println("Area: " + square.calculateArea()); 
		Assert.assertEquals(beforeHeight, afterHeight);//This assert fails.
		System.out.println();
	}
	
}
