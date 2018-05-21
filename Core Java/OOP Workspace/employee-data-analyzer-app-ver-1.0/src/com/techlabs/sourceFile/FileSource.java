package com.techlabs.sourceFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class FileSource {
	String content;

	public Set<String> fileContentsInList(String path) {
		File file = new File(path);
		FileReader fr;
		Set<String> dataFromFile = new LinkedHashSet<String>();
		try {
			fr = new FileReader(file.getAbsoluteFile());
			BufferedReader br = new BufferedReader(fr);
			while ((content = br.readLine()) != null) {
				dataFromFile.add(content);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataFromFile;
	}
}
