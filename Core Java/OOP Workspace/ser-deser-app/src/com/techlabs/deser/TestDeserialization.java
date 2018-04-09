package com.techlabs.deser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.techlabs.test.Account;

public class TestDeserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fileStream = new FileInputStream("TestSerliz.ser");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			Object one = os.readObject();
			Object two = os.readObject();
			Account ob1 = (Account)one;
			Account ob2 = (Account)two;
			System.out.println(ob1.getAccno());
			System.out.println(ob1.getName());
			System.out.println(ob1.getBalance());
			System.out.println();
			System.out.println(ob2.getAccno());
			System.out.println(ob2.getName());
			System.out.println(ob2.getBalance());
			os.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
