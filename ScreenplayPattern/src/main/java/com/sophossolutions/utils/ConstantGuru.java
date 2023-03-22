package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class ConstantGuru {

	private static ConstantGuru instance;
	private Map<String, String> constantGuru = new HashMap<String, String>();

	private ConstantGuru() {
		constantGuru.put( "Login Guru99" , "https://demo.guru99.com/V4/" );

	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new ConstantGuru();
		}
		return instance.constantGuru.get(key);
	}
}
