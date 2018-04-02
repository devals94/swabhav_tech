/*
 * Problem Statement:
 * 	Calculate radius,area,perimeter of a circle.Also display the color of the circle.Allowed colors are RED,GREEN,BLUE only else NOT APPLICABLE.
 * */
package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTestCases {
	public static void main(String[] args) {
		Circle circle1 = new Circle(.05f,"pink");
		
		display(circle1);
		Circle circle2 = new Circle(.25f,"BlUE");
		display(circle2);
		Circle circle3 = new Circle(.35f,"GreEN");
		display(circle3);
		Circle circle4 = new Circle(.45f,"YelLoW");
		display(circle4);
	}
	
	public static void display(Circle c){
		System.out.println("Radius of Circle is " + c.getRadius());
		System.out.println("Area of Circle is " + c.calculateArea());
		System.out.println("Perimeter of Circle is: " + c.calculatePerimeter());
		System.out.println("Color of Circle is " + c.getColor());
		System.out.println();
	}
}
