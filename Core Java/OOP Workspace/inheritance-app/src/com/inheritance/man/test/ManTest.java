package com.inheritance.man.test;

import com.inheritance.man.Boy;
import com.inheritance.man.Infant;
import com.inheritance.man.Kid;
import com.inheritance.man.Man;

public class ManTest {
	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
	}

	public static void case1() {
		Man man;
		man = new Man();
		man.read();
		man.play();
		System.out.println();
	}

	public static void case2() {
		Boy boy;
		boy = new Boy();
		boy.read();
		boy.play();
		boy.walk();
		boy.eat();
		System.out.println();
	}

	public static void case3() {
		Man man;
		man = new Boy();
		man.read();
		man.play();
		System.out.println();
	}
	
	public static void case4(){
		atThePlayground(new Man());
		atThePlayground(new Boy());
		atThePlayground(new Kid());
		atThePlayground(new Infant());
		System.out.println();
	}
	
	public static void atThePlayground(Man man){
		man.play();
		System.out.println("At the playground.");
		
	}
}
