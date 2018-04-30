package com.techlabs.exception;

public class TestStackTrace_1 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			
		}
		System.out.println("End of main");
	}

	private static void m1() throws Exception {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("Inside m3");
		Exception ex = new Exception("m3 throws exception");
		throw ex;
	}
}
