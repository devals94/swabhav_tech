package com.techlabs.propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyFile {
	public static void main(String[] args) {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream(
					"src\\com\\techlabs\\propertyfile\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
