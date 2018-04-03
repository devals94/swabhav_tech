package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestInstances {
	public static void main(String[] args) {
		Account acc1 = new Account(103, "Roger", 5000);
		System.out.println(acc1.getInstances());
		Account acc2 = new Account(104, "David");
		System.out.println(acc1.getInstances());
		Account acc3 = new Account(105, "Markam", 2000);
		System.out.println(acc1.getInstances());
		System.out.println(Account.headCount());//using static method
	}
}
