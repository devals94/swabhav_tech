package com.techlabs.custom;

import java.util.Scanner;

public class TestException {
	public static void main(String[] args) throws MyException {
		Scanner reader = new Scanner(System.in);
		String word = reader.nextLine();
		
		if(word.contains("a")){
			try {
				throw new MyException("My one time exception with some message!");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(word.contains("b")){
			throw new MyException("Runtime exception with some message!");
		}
	}
}
