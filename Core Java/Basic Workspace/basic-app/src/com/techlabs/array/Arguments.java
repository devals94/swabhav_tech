package com.techlabs.array;

public class Arguments {
	public static void main(String[] args) {
		displayArguments(args);
		System.out.println("Thank you");
	}

	private static void displayArguments(String[] args) {
		if (args.length == 0) {
			System.out.println("Please pass some arguments");
			return;
		}
		for (String argument : args) {
			System.out.println("Hello " + argument);
		}

	}

}
