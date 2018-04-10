package com.techlabs.propertyfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class SetPropertyFile {
	public static void main(String[] args) {
		Properties prop = new Properties();
		OutputStream output = null;
		try {
			output = new FileOutputStream(
					"src\\com\\techlabs\\propertyfile\\config.properties");
			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "user");
			prop.setProperty("dbpassword", "password");
			prop.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
