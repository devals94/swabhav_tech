package com.techlabs.sourceFile;

import java.util.Set;

public class SourceParser {

	public SourceParser(Set<String> sourceInput) {
		for (String clean : sourceInput) {
			System.out.println(clean);
		}
	}
}