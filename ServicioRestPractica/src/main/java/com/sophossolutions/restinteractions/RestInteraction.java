package com.sophossolutions.restinteractions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import java.util.Map;

import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;

public class RestInteraction {

	public static String strBaseUrl;

	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.strBaseUrl = strBaseUrl;
	}

	public static void executeGetRest(String strEndPoint) {
		SerenityRest.given().when().get(strBaseUrl.concat(strEndPoint)).then().statusCode(200);
		

	}

	public static void validateStatusCode(int intStatusCode) {
		int statusResponsecode = SerenityRest.lastResponse().getStatusCode();
		assertEquals(intStatusCode, statusResponsecode, "El Status esperado no coincide..");
	}

	public static void validateField(String fieldName, String fieldValue) {
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		String strFieldValueObtained = responseJSON.getString(fieldName);
		assertEquals(fieldValue, strFieldValueObtained, "El valor del campo esperado no coincide...");

	}
	public static void validateFields(String fieldkey, String fieldValue) {
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
		String strFieldValueObtained = responseJSON.getString(fieldkey);				
		assertEquals(fieldValue, strFieldValueObtained, "El valor del campo esperado no coincide...");
	}

	public static void validateFieldTable(DataTable tableParams) {
		Map<String, String> listpoki = tableParams.asMap();
		listpoki.forEach((key, value) -> validateFields(key, value));
		SerenityRest.lastResponse().prettyPeek();
	
		

	}
	
	public static void validateSchema(String strSchema) {
		SerenityRest.lastResponse().then().assertThat()
		.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData(strSchema))));
		
	}

}
