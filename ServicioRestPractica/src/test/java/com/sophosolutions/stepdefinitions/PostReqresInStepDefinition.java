package com.sophosolutions.stepdefinitions;

import static com.sophossolutions.utils.Constants.getData;

import java.util.Map;


import com.sophossolutions.apis.ReqresApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class PostReqresInStepDefinition {

	@Given("Dado que {string} establece la base url {string} del servicio.")
	public void dadoQueEstableceLaBaseUrlDelServicio(String name, String baseUrl) {
		ReqresApi.setBaseUrlreqres(Constants.getData(baseUrl));
		System.out.println("prueba");
	   
	}
	@When("consulta el endpoint {string} por medio de una peticion post.")
	public void consultaElEndpointPorMedioDeUnaPeticionPost(String endpointR,DataTable dataTable) {
		Map<String, String> body = dataTable.asMap(String.class, String.class);
		SerenityRest.given().contentType(ContentType.JSON).when().body(body)
				.post(getData("Go Reqres").concat(getData(endpointR)));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	@Then("validar el statuscode sea {int} y que el esquema {string} sea correcto.")
	public void validarElStatuscodeSeaYQueElEsquemaSeaCorrecto(Integer int1, String squemaReqres) {
	   ReqresApi.validateSchema(squemaReqres);
	}
}
