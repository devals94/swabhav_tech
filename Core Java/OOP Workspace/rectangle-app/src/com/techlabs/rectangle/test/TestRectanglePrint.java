package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectanglePrint {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.setWidth(50);
		rect1.setHeight(10);
		print(rect1);
		System.out.println();
		Rectangle rect2 = new Rectangle();
		rect2.setWidth(30);
		rect2.setHeight(10);
		print(rect2);
		
		print(new Rectangle());
		
		Rectangle temp = rect1;
		temp.setHeight(11);
		System.out.println(temp.getHeight());
		System.out.println(rect1.getHeight());
		
		temp = null;
		System.out.println(rect1.getHeight());
		//System.out.println(temp.getHeight());
		
	}

	private static void print(Rectangle r) {
		System.out.println("Width is " + r.getWidth());
		System.out.println("Height is " + r.getHeight());
		System.out.println("Area of Rectangle is " + r.calArea());
	}
}
