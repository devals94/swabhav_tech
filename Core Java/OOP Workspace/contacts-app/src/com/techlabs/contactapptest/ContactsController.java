package com.techlabs.contactapptest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.contactapp.Contact;

public class ContactsController {

	private static final int ADD = 1;
	private static final int DISPLAY = 2;
	private static final int EXPORT = 3;
	private static final int EXIT = 4;

	Scanner scan = new Scanner(System.in);
	int userInput;

	ContactStore cs = new ContactStore();
	ArrayList<Contact> contactslist = cs.retrieve();

	public void start() throws IOException, ClassNotFoundException {
		showMenu();
		userInput = scan.nextInt();
		flow(userInput);
	}

	public void showMenu() {
		System.out.println("Current Items in Contact List " + contactslist.size());
		System.out.println("Welcome to the Menu!");
		System.out.println("1.Add Contacts");
		System.out.println("2.Display Contacts");
		System.out.println("3.Export Contacts List");
		System.out.println("4.Exit Menu");
		System.out.println("Please input a number");
	}

	public void flow(int userInput) throws IOException, ClassNotFoundException {
		if (userInput == ADD) {
			// add values to list
			System.out.println("Enter ID: ");
			int id = scan.nextInt();
			System.out.println("Enter a Name: ");
			String name = scan.next();
			scan.nextLine();
			System.out.println("Enter a Number: ");
			int number = scan.nextInt();
			contactslist.add(new Contact(id, name, number));
			contactslist.size();
			System.out.println();
			start();
		}

		else if (userInput == DISPLAY) {
			// retrieve values from list
			for (Contact dis : contactslist) {
				System.out.println("\n Id: " + dis.getId() + "\n Name: "
						+ dis.getName() + "\n Number: " + dis.getNumber());
			}
			System.out.println();
			start();
		}

		else if (userInput == EXPORT) {
			// exports list at the specified path
			 cs.export(contactslist);
			 System.out.println();
			 start();
		}

		else if (userInput == EXIT) {
			// save values to list on exit
			cs.save(contactslist);
			System.out.println("Thankyou for using Contacts-App.");
			System.out.println();
			System.exit(0);
		}
	}

}
