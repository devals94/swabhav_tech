package com.techlabs.exception;

public class TestBug_1 {
	public static void main(String[] args) {
		try {
			main(new String[] { "50", "10" }); // calling main from main will
												// result in StackOverFlowError
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
