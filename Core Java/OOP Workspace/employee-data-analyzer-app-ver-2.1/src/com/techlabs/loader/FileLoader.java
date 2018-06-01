package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileLoader implements ILoader {
	String path;

	public FileLoader(String path) {
		this.path = path;
	}

	@Override
	public List<String> getContentsFromSource() throws IOException {
		List<String> fileContents = new LinkedList<String>();
		File file = new File(this.path);
		FileReader fr = new FileReader(file.getAbsolutePath());
		BufferedReader in = new BufferedReader(fr);
		String content;
		while ((content = in.readLine()) != null) {
			fileContents.add(content);
		}
		in.close();
		return fileContents;
	}
}
