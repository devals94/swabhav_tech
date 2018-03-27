/*Write a Program to split the URL using split method of String class.*/
package com.assignment;

public class TestSplit {
	public static void main(String[] args) {

		String url = "http://www.swabhavtechlabs.com?developer=deval";

		String[] splitArrayForDomain = url.split("[.]");
		String domain = splitArrayForDomain[1];

		String[] splitArrayForDeveloperName = url.split("=");
		String developerName = splitArrayForDeveloperName[1];

		System.out.println(domain + "\t" + developerName + "\n");

	}

}
