package com.techlabs.map_collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("David", 40);
		marks.put("Raj", 30);
		marks.put("Negi", 80);
		marks.put("Sam", 50);
		marks.put("Mike", 75);
		
		for (String key : marks.keySet()) {
		    System.out.println(key + " " + marks.get(key));
		}
		
	}
}
