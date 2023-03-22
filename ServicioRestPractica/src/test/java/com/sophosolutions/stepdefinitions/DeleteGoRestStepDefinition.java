package com.sophosolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class DeleteGoRestStepDefinition {
	

	@When("consult the endpoint for delete {string} con id {int}")
	public void consultTheEndpointForDeleteConId(String endPoint, Integer iduser) {
		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).contentType(ContentType.JSON).when().delete(RestInteraction.strBaseUrl.concat(Constants.getData(endPoint).concat(iduser+"")));
		   SerenityRest.lastResponse().prettyPeek();
	}
	@Then("validar que el status sea {int}")
	public void validarQueElStatusSea(Integer int1) {
	    GoRestApi.validateStatusCode(int1);
	}
}
