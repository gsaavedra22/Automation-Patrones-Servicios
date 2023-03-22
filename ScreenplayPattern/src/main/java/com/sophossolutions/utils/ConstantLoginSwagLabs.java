package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class ConstantLoginSwagLabs {
	private static ConstantLoginSwagLabs instance;
	private Map<String, String> constantswag = new HashMap<String, String>();

	private ConstantLoginSwagLabs() {
		constantswag.put( "Swag Labs" , "https://www.saucedemo.com/" );
		constantswag.put("User", "standard_user");
		constantswag.put("Password", "secret_sauce");
		constantswag.put("Validation Checkout", "THANK YOU FOR YOUR ORDER");
		

	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new ConstantLoginSwagLabs();
		}
		return instance.constantswag.get(key);
	}

	

}
