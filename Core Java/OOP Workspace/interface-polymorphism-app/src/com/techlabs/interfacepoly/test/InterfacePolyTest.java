package com.techlabs.interfacepoly.test;

import com.techlabs.interfacepoly.Boy;
import com.techlabs.interfacepoly.IEmotionable;
import com.techlabs.interfacepoly.IMannerable;
import com.techlabs.interfacepoly.Man;

public class InterfacePolyTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		atTheParty(boy);
		atTheMovies(boy);
		//atTheMovies(man);
		
	}

	public static void atTheMovies(IEmotionable emoj) {
		System.out.println("At the Movies");
		emoj.cry();
		emoj.laugh();
		System.out.println();
	}

	public static void atTheParty(IMannerable mann) {
		System.out.println("At the Party");
		mann.wish();
		mann.depart();
		System.out.println();
	}
}
