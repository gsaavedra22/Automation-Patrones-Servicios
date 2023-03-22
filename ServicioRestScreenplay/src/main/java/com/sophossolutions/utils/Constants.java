package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {
		constantDir.put("Actor", "geraldine");
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("Go Endpoint", "/public/v2/users/");
		constantDir.put("Token Go Rest", "5d6fa3c551ede5ae551f165588e08d9115d2e2d32d2e40fe2063395c00393e3f");
		
	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
