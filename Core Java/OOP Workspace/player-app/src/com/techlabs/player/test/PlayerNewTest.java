package com.techlabs.player.test;

import com.techlabs.player.PlayerNew;

public class PlayerNewTest {
	public static void main(String[] args) {
		PlayerNew p1 = new PlayerNew("Sachin", 50);
		
		System.out.println(p1.getId());
		System.out.println();
		
		PlayerNew p2 = new PlayerNew("Rahul", 45);
		System.out.println(p2.getId());
		System.out.println();
		
		PlayerNew p3 = new PlayerNew("Rohit3", 30);
		System.out.println(p1.getId());
		System.out.println(p3.getId());
		System.out.println();
		
		PlayerNew p4 = new PlayerNew("Nehra", 40);
		System.out.println(p4.getId());
		System.out.println(p2.getId());
		System.out.println(p3.getId());
		System.out.println();
		
		System.out.println(p1);
	}
}
