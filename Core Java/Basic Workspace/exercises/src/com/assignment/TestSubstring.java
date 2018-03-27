/*Write a Program to split the URL using substring of String class.*/
package com.assignment;

public class TestSubstring {
	public static void main(String[] args) throws Exception {
		String url = "http://www.swabhavtechlabs.com?developer=deval";
		
		int firstDotPosition = url.indexOf('.');
		int lastDotPosition = url.lastIndexOf('.');
		
		String domain = url.substring(firstDotPosition + 1, lastDotPosition);
		System.out.print(domain + "\t");
		
		int equalsPosition = url.indexOf("=");
		String developerName = url.substring(equalsPosition + 1);
		System.out.print(developerName + "\t");
	}
}
