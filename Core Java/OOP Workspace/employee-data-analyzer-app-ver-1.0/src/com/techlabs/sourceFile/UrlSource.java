package com.techlabs.sourceFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashSet;
import java.util.Set;

public class UrlSource {

	public Set<String> getUrlContents(String theURL) throws IOException {
		String targetURL = theURL;

		URL url = new URL(targetURL);
		URLConnection urlConnection = url.openConnection();
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(
				urlConnection.getInputStream()));
		Set<String> dataFromUrl = new LinkedHashSet<String>();
		String line;

		while ((line = buffRead.readLine()) != null) {
			String[] test = line.toString().split("\n");
			for (String ok : test) {
				dataFromUrl.add(ok);
			}
		}
		buffRead.close();
		return dataFromUrl;
	}
}
