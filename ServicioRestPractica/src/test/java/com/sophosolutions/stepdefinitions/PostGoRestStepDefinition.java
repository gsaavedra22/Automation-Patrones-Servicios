package com.sophosolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.PostGoRestApi;

import static com.sophossolutions.utils.Constants.getData;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class PostGoRestStepDefinition {
	
	@When("consulta el endpoint {string} por medio de una peticion post")
	public void consultaElEndpointPorMedioDeUnaPeticionPost(String strEndPoint, DataTable dataTable) {
		Map<String, String> body = dataTable.asMap(String.class, String.class);
		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).contentType(ContentType.JSON).when().body(body)
				.post(getData("Go Rest").concat(getData(strEndPoint)));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	@Then("validar el statuscode sea {int} y que el esquema {string} sea correcto")
	public void validarElStatuscodeSeaYQueElEsquemaSeaCorrecto(Integer int1, String squema) {
		PostGoRestApi.validateSquema(squema);
		System.out.println("then");
	   
	}
}
