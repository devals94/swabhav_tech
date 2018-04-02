package com.techlabs.rectangleconst.test;

import com.techlabs.rectangleconst.BorderStyleType;
import com.techlabs.rectangleconst.Rectangle;

public class RectangleTestCase {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(30,40,BorderStyleType.DOUBLE_LINE);
		Rectangle rect2 = new Rectangle(10,20);
		Rectangle rect3 = new Rectangle(10,30,BorderStyleType.DOTTED_LINE);
		printRectangleDetails(rect1);
		printRectangleDetails(rect2);
		printRectangleDetails(rect3);
		Rectangle big =rect3.whoIsBig(rect1);
		System.out.println("Bigger Rectangle DIMENSIONS are: ");
		printRectangleDetails(big);
	}
	
	public static void printRectangleDetails(Rectangle r){
		System.out.println("Width of Rectangle is " + r.getWidth());
		System.out.println("Height of Rectangle is " + r.getHeight());
		System.out.println("BorderStyle of Rectangle is " + r.getBorderStyle());
		System.out.println("Area of Rectangle is " + r.calArea());
		System.out.println();	
	} 
}
