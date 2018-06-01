package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;

public class UrlLoader implements ILoader {
	String theUrl;

	public UrlLoader(String theUrl) {
		this.theUrl = theUrl;
	}

	@Override
	public List<String> getContentsFromSource() throws IOException {
		String targetUrl = this.theUrl;
		URL url = new URL(targetUrl);
		URLConnection urlConnection = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				urlConnection.getInputStream()));
		List<String> urlContents = new LinkedList<String>();
		String line;
		while ((line = in.readLine()) != null) {
			urlContents.add(line);
		}
		in.close();
		return urlContents;
	}
}
