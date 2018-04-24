package com.techlabs.exception;

public class TestStackTrace_2 {
	public static void main(String[] args) throws RuntimeException {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);

		}
		System.out.println("End of main");
	}

	private static void m1() throws RuntimeException {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() throws RuntimeException {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() throws RuntimeException {
		System.out.println("Inside m3");
		RuntimeException rex = new RuntimeException(
				"m3 throws runtime exception");
		throw rex;
	}
}
