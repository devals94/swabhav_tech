package com.techlabs.set_collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> marks = new HashSet<Integer>();
		marks.add(80);
		marks.add(10);
		marks.add(70);
		marks.add(40);
		marks.add(50);
		marks.add(100);
		marks.add(120);
		marks.add(70);
		marks.add(80);
		
		for(Integer mark: marks){
			System.out.println(mark);
		}
	}
}
