package com.techlabs.rto.test;

import java.util.Map;
import java.util.Scanner;

import com.techlabs.readFile.RTODataSourceFile;

public class TestRto {
	static int userInput = 1;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		start();
	}

	public static void printMapList(Map<String, String> mapper) {
		for (String name : mapper.keySet()) {
			String key = name.toString();
			String value = mapper.get(name).toString();
			System.out.println(key + " " + value);
		}
	}

	public static void start() {
		System.out.println();
		System.out.println("What do you want to do?");
		System.out.println("1.Display All");
		System.out.println("2.Search Individually");
		System.out.println("3.Exit");
		System.out.println("Please input a number");
		int userInput = scan.nextInt();
		callSwitch(userInput);
	}

	public static void callSwitch(int userInput) {
		RTODataSourceFile entryList = new RTODataSourceFile();
		switch (userInput) {
		case 1:
			Map<String, String> displayList = entryList.displayAll();
			printMapList(displayList);
			start();
			break;
		case 2:
			System.out.println("Please input some alphabets: ");
			String alphabets = scan.next();
			Map<String, String> searchList = entryList
					.searchIndividually(alphabets);
			printMapList(searchList);
			start();
			break;
		case 3:
			System.out.println("Thankyou for using RTO-App");
			scan.close();
			break;
		}
	}
}
