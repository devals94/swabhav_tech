package com.techlabs.exception;

public class TestBug {
	public static void main(String[] args) {
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println(c);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
