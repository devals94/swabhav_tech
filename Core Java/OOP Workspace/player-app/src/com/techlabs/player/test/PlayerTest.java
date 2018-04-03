package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		 Player p1 = new Player("Sachin",50);
		 System.out.println(p1.getId());
		 Player p2 = new Player("Rahul",45);
		 System.out.println(p2.getId());
		 System.out.println(p1.getId());
		 System.out.println(p1.getId());
		 System.out.println(p2.getId());
	}
}
