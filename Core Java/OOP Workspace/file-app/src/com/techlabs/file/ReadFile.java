/*
 * Problem Statement:Read a text file which is already created.
 * */package com.techlabs.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\file-app\\src\\com\\techlabs\\file\\MyFile.txt";
			
			File readfile = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(readfile));
			String content;
			while((content = br.readLine()) != null){
				System.out.println(content);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}


