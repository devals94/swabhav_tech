package com.techlabs.contactapptest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.contactapp.Contact;

public class ContactStore {

	public ArrayList<Contact> retrieve() {
		ArrayList<Contact> newlist = null;
		try {
			FileInputStream fileStream = new FileInputStream(
					"data\\Contacts.txt");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			@SuppressWarnings("unchecked")
			ArrayList<Contact> al = (ArrayList<Contact>) os.readObject();
			os.close();
			newlist = al;
			return al;
		} catch (FileNotFoundException fn) {
			return (new ArrayList<Contact>());
		} catch (IOException io) {
			System.out.println(io);
		} catch (ClassNotFoundException cnf) {
			System.out.println(cnf);
		}
		return newlist;
	}

	public void save(ArrayList<Contact> values) throws FileNotFoundException,
			IOException {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(
				"data\\Contacts.txt"));
		os.writeObject(values);
		os.close();
	}

	public void export(ArrayList<Contact> details)
			throws FileNotFoundException, IOException {

		String path = "data\\Contacts.csv";
		File file = new File(path);
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		if (file.exists()) {

		}
		for (Contact c : details) {
			bw.write(c.getId() + "," + c.getName() + "," + c.getNumber() + "\n");
		}
		System.out.println("File is exported.");
		System.out.println();
		bw.close();
	}
}