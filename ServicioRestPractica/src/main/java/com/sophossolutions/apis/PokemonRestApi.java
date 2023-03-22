package com.sophossolutions.apis;

import com.sophossolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class PokemonRestApi {

	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}
	
	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}
	
	public static void validateFieldTable(DataTable tableParams) {
		RestInteraction.validateFieldTable(tableParams);

	}
	public static void validateSquema(String srtSquema) {
		RestInteraction.validateSchema(srtSquema);
	}
	
	
}
