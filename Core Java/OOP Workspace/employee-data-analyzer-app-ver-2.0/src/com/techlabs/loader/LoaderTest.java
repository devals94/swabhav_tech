package com.techlabs.loader;

import java.io.IOException;
import java.util.List;

public class LoaderTest {
	/*
	 * public static void main(String[] args) throws IOException { String path =
	 * "D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app-ver-1.0\\src\\com\\techlabs\\test.txt"
	 * ; FileLoader fileLoader = new FileLoader();
	 * //printDetails(fileLoader.getContentsFromFile(path));
	 * 
	 * String url = "https://swabhav-tech.firebaseapp.com/emp.txt"; UrlLoader
	 * urlLoader = new UrlLoader();
	 * printDetails(urlLoader.getContentsFromUrl(url)); }
	 * 
	 * public static void printDetails(List<String> contentsFromFile) { for
	 * (String data : contentsFromFile) { System.out.println(data); } }
	 */

	/*
	 * public static void main(String[] args) throws IOException { String path =
	 * "D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app-ver-1.0\\src\\com\\techlabs\\test.txt"
	 * ; LoaderClass myclass = new LoaderClass();
	 * myclass.loaderMethod(Loader.FILE_LOADER, path); }
	 */

	public static void main(String[] args) throws IOException {
		String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app-ver-1.0\\src\\com\\techlabs\\test.txt";
		FileLoader fileLoader = new FileLoader(path);
		printDetails(fileLoader.getContentsFromSource());
	}

	public static void printDetails(List<String> contentsFromFile) {
		for (String data : contentsFromFile) {
			System.out.println(data);
		}
	}
}
