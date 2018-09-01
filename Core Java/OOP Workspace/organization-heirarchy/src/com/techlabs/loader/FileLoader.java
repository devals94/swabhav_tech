package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileLoader {
	private final String defaultPath = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\organization-heirarchy\\resources\\dataFile.txt";
	
	private Set<String> employeeSet;

	public FileLoader() {
		employeeSet = new HashSet<String>();
	}

	public Set<String> loadFile() throws IOException {
		File file = new File(defaultPath);
		//System.out.println(file.getAbsolutePath());
		BufferedReader bufferReader = new BufferedReader(new FileReader(file.getAbsolutePath()));

		String currentLine = "";
		while ((currentLine = bufferReader.readLine()) != null) {
			employeeSet.add(currentLine);
		}
		bufferReader.close();
		
		return employeeSet;	
	}
}