package com.techlabs.readFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeMap;

public class RTODataSourceFile {
	Map<String, String> statesList = new TreeMap<String, String>();

	private void loadFile() {
		Properties properties = new Properties();
		InputStream configFile = null;

		try {
			configFile = new FileInputStream(
					"src\\com\\techlabs\\property\\config.properties");

			properties.load(configFile);

			/*
			 * Set<Object> keys = properties.keySet(); for (Object keysList :
			 * keys) { String key = (String) keysList.toString(); String value =
			 * properties.getProperty(key); statesList.put(key, value); }
			 */

			for (String key : properties.stringPropertyNames()) {
				statesList.put(key, properties.getProperty(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Map<String, String> displayAll() {
		loadFile();
		Map<String, String> displayMap = new TreeMap<String, String>();
		for (Map.Entry<String, String> entry : statesList.entrySet()) {
			displayMap.put(entry.getKey(), entry.getValue());
		}
		return displayMap;
	}

	public Map<String, String> searchIndividually(String abbreviation) {
		loadFile();
		Map<String, String> searchMap = new TreeMap<String, String>();
		Iterator<Entry<String, String>> itr = statesList.entrySet()
				.iterator();
		while (itr.hasNext()) {
			Map.Entry pairs = itr.next();
			String statesWithLowerCase = pairs.getValue().toString()
					.toLowerCase();
			boolean availableStates = statesWithLowerCase.contains(abbreviation
					.toLowerCase());
			if (availableStates) {
				searchMap.put((String)pairs.getKey(),(String)pairs.getValue());
			}
		}
		return searchMap;
	}
}
