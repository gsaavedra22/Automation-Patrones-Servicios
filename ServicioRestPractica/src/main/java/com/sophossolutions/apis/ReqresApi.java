package com.sophossolutions.apis;

import java.io.File;

import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

public class ReqresApi {
	public static void setBaseUrlreqres(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}
	public static void validateSchema(String squemaReqres) {
		SerenityRest.lastResponse().then().assertThat()
		.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData(squemaReqres))));
		
	}
	
}
