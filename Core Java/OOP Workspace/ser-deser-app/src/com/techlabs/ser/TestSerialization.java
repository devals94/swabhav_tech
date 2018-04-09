package com.techlabs.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.techlabs.test.*;

public class TestSerialization implements Serializable{
	public static void main(String[] args) {
		Account acc1 = new Account(101,"Steve",2000);
		acc1.deposit(500);
		acc1.withdraw(1000);
		displayDetails(acc1);
		
		Account acc2 = new Account(102, "John");
		acc2.deposit(500);
		acc2.withdraw(1500);
		displayDetails(acc2);
		
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("TestSerliz.ser"));
			os.writeObject(acc1);
			os.writeObject(acc2);
			os.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void displayDetails(Account acc){
		System.out.println("Account Number: " + acc.getAccno());
		System.out.println("Account Holder Name: " + acc.getName());
		System.out.println("Account Balance: " + acc.getBalance());
		System.out.println();
	}
	
	
}
