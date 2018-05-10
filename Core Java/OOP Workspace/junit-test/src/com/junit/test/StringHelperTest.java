package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AAACD"));
	}

}
