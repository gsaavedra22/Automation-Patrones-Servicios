package com.sophossolutions.apis;

import com.sophossolutions.restinteractions.RestInteraction;

public class PostGoRestApi {
	
	public static void validateSquema(String srtSquema) {
		RestInteraction.validateSchema(srtSquema);
	}

}
