package com.techlabs.map_collections;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> marks = new TreeMap<Integer, String>();
		marks.put(40, "David");
		marks.put(30, "Raj");
		marks.put(80, "Negi");
		marks.put(50, "Sam");
		marks.put(75, "Mike");

		for (Integer key : marks.keySet()) {
			System.out.println(key + " " + marks.get(key));
		}

	}
}
