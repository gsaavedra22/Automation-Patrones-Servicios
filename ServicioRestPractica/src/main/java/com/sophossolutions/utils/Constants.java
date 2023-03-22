package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("EndPoint", "/public/v2/users");
		constantDir.put("EndPointDelete", "/public/v2/users/");
		
		constantDir.put("Go Pokemon", "https://pokeapi.co/");
		constantDir.put("EndPointPokemon", "/api/v2/nature");
		
		constantDir.put("Go Reqres", "https://reqres.in");
		constantDir.put("Reqres Endpoint", "/api/users");
		
		constantDir.put("PlaceHolder Url", "https://jsonplaceholder.typicode.com");
		constantDir.put("PlaceHolder Endpoint", "/posts");
		
		constantDir.put("SquemaGorest", "src/test/resources/com/sophossolutions/squemas/squema_gorest.json");
		constantDir.put("ReqresSquema", "src/test/resources/com/sophossolutions/squemas/squema_reqres.json");
		constantDir.put("Squema", "src/test/resources/com/sophossolutions/squemas/squema.json");
		constantDir.put("PlaceHolderSquema", "src/test/resources/com/sophossolutions/squemas/squema_placeholder.json");

	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
