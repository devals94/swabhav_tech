package com.techlabs.rectangle.unittest;

import org.junit.Assert;
import org.junit.Test;

import com.techlabs.rectangle.Rectangle;

public class RectangleUnitTest {

	Rectangle rectangle = new Rectangle();
	
	@Test
	public void shouldTestHeightWithNegativeValue(){
		rectangle.setWidth(-150);
		int expectedValue = 1;
		int actualValue = rectangle.getWidth();
		
		Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void shouldTestHeightWithPositiveValue(){
		rectangle.setWidth(15);
		int expectedValue = 15;
		int actualValue = rectangle.getWidth();
		
		Assert.assertEquals(expectedValue, actualValue);
	}
}
