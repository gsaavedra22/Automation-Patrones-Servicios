package com.sophossolutions.apis;

import com.sophossolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
	public static final String STR_TOKEN="46d484e2171d1b2ffd9617a98e7777a9aa4ea1a1f24fd375c295fadebd10f5da";

	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}

	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}

	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}

	public static void validateNameField(String strfieldName, String strfieldValue) {
		RestInteraction.validateField(strfieldName, strfieldValue);
	}

	public static void validateFieldTable(DataTable tableParams) {
		RestInteraction.validateFieldTable(tableParams);

	}
	
	
}
