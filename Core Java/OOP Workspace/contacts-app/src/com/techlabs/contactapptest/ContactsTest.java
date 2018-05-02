package com.techlabs.contactapptest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.techlabs.contactapp.Contact;

public class ContactsTest {
	private static final int EXIT = 4;
	private static final int ADD = 1;
	private static final int DISPLAY = 2;
	private static final int EXPORT = 3;

	public static void main(String[] args) throws Exception {
		Contact contacts = new Contact(0, "default", 0);
		contacts.menu();

		ArrayList<Contact> info = new ArrayList<>();
		int id, number;
		String name;
		String HEADER = "Id,Name,Number";
		String COLUMN = HEADER.substring(0, HEADER.indexOf(","));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		while (input != EXIT) {

			if (input == EXPORT) {
				String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\contacts-app\\src\\com\\techlabs\\Contacts.csv";
				File file = new File(path);
				FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
				BufferedWriter bw = new BufferedWriter(fw);
				if (file.exists()) {
					
				}
				for (Contact c : info) {
					bw.write(c.getId() + "," + c.getName() + ","
							+ c.getNumber() + "\n");
				}
				System.out.println("File is exported.");
				System.out.println();
				bw.close();
				contacts.menu();
				input = Integer.parseInt(br.readLine());
			}

			else if (input == ADD) {
				System.out.println("Enter a id: ");
				id = Integer.parseInt(br.readLine());
				System.out.println("Enter a Name: ");
				name = br.readLine();
				System.out.println("Enter a Number: ");
				number = Integer.parseInt(br.readLine());
				info.add(new Contact(id, name, number));

				String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\contacts-app\\src\\com\\techlabs\\Contacts.txt";
				File file = new File(path);
				FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Id: " + id + " Name: " + name + " Number: " + number
						+ "\n");
				bw.close();
				System.out.println();
				contacts.menu();
				input = Integer.parseInt(br.readLine());
			}

			else if (input == DISPLAY) {
				String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\contacts-app\\src\\com\\techlabs\\Contacts.txt";
				File file = new File(path);
				FileReader fr = new FileReader(file.getAbsoluteFile());
				BufferedReader in = new BufferedReader(fr);
				String content;
				if (file.exists()) {
					while ((content = in.readLine()) != null) {
						System.out.println(content);
					}
					in.close();
					System.out.println();
					contacts.menu();
					input = Integer.parseInt(br.readLine());
				} else {
					System.out.println();
					contacts.menu();
					input = Integer.parseInt(br.readLine());
				}
			}
		}
	}
}
