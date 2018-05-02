package com.techlabs.contactapptest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.contactapp.Contact;

public class ContactStoreTest {
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ArrayList<Contact> cst = new ArrayList<Contact>();

		ContactStore cs = new ContactStore();
		Contact c1 = new Contact(100, "Rahul", 5000);
		Contact c2 = new Contact(111, "Steve", 1000);
		Contact c3 = new Contact(333, "Sachin", 3000);
		cst.add(c1);
		cst.add(c2);
		cst.add(c3);
		
		//System.out.println(cs.listcount(cst));
		//cs.save(cst);
		cs.export(cst);
		
		ArrayList<Contact> ans = (ArrayList<Contact>)cs.retrieve();
		printDetails(ans);
		
	}
	
	public static void printDetails(ArrayList<Contact> ans){
		for(Contact i: ans ){
			System.out.println(i.getId());
			System.out.println(i.getName());
			System.out.println(i.getNumber());
			System.out.println();
		}
	}
}
