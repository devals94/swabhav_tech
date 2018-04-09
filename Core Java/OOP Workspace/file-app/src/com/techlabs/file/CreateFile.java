/*
 * Problem Statement:Create a text file from eclipse.Once file is created add contents into it.
 * File should not overwrite the contents,it should append the contents if run again.
 * */
package com.techlabs.file;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateFile {
	public static void main(String[] args) {
		try {
			String content = "She sells seashells by the seashore" + "\n";
			String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\file-app\\src\\com\\techlabs\\file\\MyFile.txt";

			// create new file
			File file = new File(path);

			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			// If file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File created");
			}
			else
				System.out.println("File updated");

			bw.write(content);
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
