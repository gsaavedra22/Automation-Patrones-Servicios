package com.sophosolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetGoRestStepDefinition {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		GoRestApi.setBaseUrl(Constants.getData(strBaseUrl));
	}
	@When("consulta el endpoint {string} con el id {string}")
	public void consultaElEndpointConElId(String endpoint) {
		GoRestApi.executeGetRest(Constants.getData(endpoint));
	}	

	@Then("validar que el status sea {int} y que la respuesta contenga")
	public void validarQueElStatusSeaYQueLaRespuestaContenga(Integer statusCode, DataTable dataTable) {
		GoRestApi.validateStatusCode(statusCode);
		GoRestApi.validateFieldTable(dataTable);
		
	}
}
