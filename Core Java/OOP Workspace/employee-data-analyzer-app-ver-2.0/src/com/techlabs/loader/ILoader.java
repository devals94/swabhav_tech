package com.techlabs.loader;

import java.io.IOException;
import java.util.List;

public interface ILoader {

	public List<String> getContentsFromSource() throws IOException;

}
