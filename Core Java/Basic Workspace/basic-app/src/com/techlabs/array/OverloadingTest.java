package com.techlabs.array;

public class OverloadingTest {
	public static void main(String[] args) {
		print();
		print(10);
		print(10.5f);
		print(10.55);
		print('a');
		print("Hi");
	
	}
	
	private static void print(){
		System.out.println("---------------------------------------------");
	}
	
	private static int print(int x){
		System.out.println("Printing integer value : " + x);
		return x;
	}
	
	private static float print(float x){
		System.out.println("Printing float value : " + x);
		return x;
	}
	
	private static double print(double x){
		System.out.println("Printing double value : " + x);
		return x;
	}
	
	private static char print(char x){
		System.out.println("Printing character : " + x);
		return x;
	}
	
	private static String print(String x){
		System.out.println("Printing String value : " + x);
		return x;
	}
	
}
