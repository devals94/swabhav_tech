package com.techlabs.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.techlabs.menu.Contact;

public class ContactTest {
	public static void main(String[] args) {
		Contact contact = new Contact("default", 0);
		contact.menuList();
		ArrayList<Contact> details = new ArrayList<Contact>();
		String name;
		int number;

		String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\contactmenu-app\\src\\com\\techlabs\\test\\Contact.csv";
		StringBuilder sb = new StringBuilder();
		String ColumnNamesList = "Name,Number";
		sb.append(ColumnNamesList + "\n");

		// create new file
		File file = new File(path);

		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File created");
			} else
				System.out.println("File updated");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int input = Integer.parseInt(br.readLine());
			while (input != 3) {
				if (input == 1) {
					System.out.println("Enter a Name: ");
					name = br.readLine();
					System.out.println("Enter a Number: ");
					number = Integer.parseInt(br.readLine());
					details.add(new Contact(name, number));
					System.out.println();
					contact.menuList();
					input = Integer.parseInt(br.readLine());
				} else if (input == 2) {
					for (Contact c : details) {
						System.out.println(c.getName() + c.getNumber());
						sb.append(c.getName() + ",");
						sb.append(c.getNumber());
						sb.append("\n");
						bw.write(sb.toString());
					}
					bw.close();
					System.out.println();
					contact.menuList();
					input = Integer.parseInt(br.readLine());

				}

			}

			br.close();
			// fw.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
