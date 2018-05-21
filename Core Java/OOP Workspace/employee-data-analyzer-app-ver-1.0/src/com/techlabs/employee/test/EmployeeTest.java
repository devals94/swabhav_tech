package com.techlabs.employee.test;

import java.util.Set;

import com.techlabs.sourceFile.FileSource;
import com.techlabs.sourceFile.SourceParser;
import com.techlabs.sourceFile.UrlSource;

public class EmployeeTest {
	public static void main(String[] args) throws Exception {

		UrlSource url = new UrlSource();
		Set<String> urlResult = url.getUrlContents("https://swabhav-tech.firebaseapp.com/emp.txt");
		getRawList(urlResult);
		
		FileSource file = new FileSource();
		Set<String> fileList = file.fileContentsInList("D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app\\src\\com\\techlabs\\test.txt");
		getRawList(fileList);
		
	}
	
	public static void getRawList(Set<String> raw){
		SourceParser parser = new SourceParser(raw);
		
		
		System.out.println("*************");
		
	}
}
