package com.techlabs.rectangle.test;

import java.util.Random;

import com.techlabs.rectangle.Rectangle;

public class RectangleArrayTest {
	public static void main(String[] args) {
		Rectangle[] rectangle = new Rectangle[3];
		int totalArea = 0;

		for (int i = 0; i < rectangle.length; i++) {
			rectangle[i] = new Rectangle();
			rectangle[i].setWidth(new Random().nextInt(106) - 50);
			System.out.println(rectangle[i].getWidth());
			rectangle[i].setHeight(new Random().nextInt(106) - 50);
			System.out.println(rectangle[i].getHeight());
			totalArea = totalArea + rectangle[i].calArea();
			System.out.println("Area of Rectangle is " + rectangle[i].calArea());
		}
		System.out.println("Total Area of Rectangle is " + totalArea);
	}
}

/*
  //4. Test [10...30]
	// min = 10 , max = 30, range = (max - min)
	new Random().nextInt((max - min) + 1) + min
	new Random().nextInt((30 - 10) + 1) + 10
	new Random().nextInt((20) + 1) + 10
	new Random().nextInt(21) + 10    //[0...20] + 10 = [10...30]
*/
 