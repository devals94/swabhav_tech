package com.techlabs.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.techlabs.menu.Contact;
import com.techlabs.test.ContactTest;;

public class CreateCSV {
	public static void main(String[] args) {
		ContactTest ct = new ContactTest();
		try {
			String content = "She sells seashells by the seashore" + "\n";
			String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\contactmenu-app\\src\\com\\techlabs\\test\\Contact.csv";

			// create new file
			File file = new File(path);
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// If file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				//for(ArrayList<Contact> each: csvInput){
					 //writer.writeNext(each.toArray(new String[each.size()]));
				//}
				System.out.println("File created");
			} else
				System.out.println("File updated");

			bw.write(content);
			bw.close();
			fw.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
