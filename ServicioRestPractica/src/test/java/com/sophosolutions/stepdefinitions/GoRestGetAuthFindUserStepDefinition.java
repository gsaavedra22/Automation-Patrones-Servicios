package com.sophosolutions.stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import static com.sophossolutions.utils.Constants.getData;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class GoRestGetAuthFindUserStepDefinition {
	
	@When("Consulta el endpoint {string} con una peticion get usando token con el id {string}")
	public void consultaElEndpointConUnaPeticionGetUsandoTokenConElId(String endpoint, String strId) {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN));
		headers.put("Content-Type", "application/json");
		SerenityRest.given().headers(headers).get(getData("Go Rest").concat(getData(endpoint).concat(strId)));
		SerenityRest.lastResponse().prettyPeek();
	}

}
