package com.sophosolutions.stepdefinitions;

import com.sophossolutions.apis.PokemonRestApi;

import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetPokemonRestStepDefinition {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Since {string} sets the {string} base url of the service")
	public void sinceSetsTheBaseUrlOfTheService(String name, String url) {
		PokemonRestApi.setBaseUrl(Constants.getData(url));

	}
	
	@When("check the endpoint {string} with the name {string}")
	public void checkTheEndpointWithTheName(String endpointPokemon, String name) {
		PokemonRestApi.executeGetRest(Constants.getData(endpointPokemon));
	}
	@Then("validate that the status is {int} and that the response contains and the {string}")
	public void validateThatTheStatusIsAndThatTheResponseContainsAndThe(Integer int1, String squema, DataTable dataTable) {
		PokemonRestApi.validateFieldTable(dataTable);
		PokemonRestApi.validateSquema(squema);
	

	}

	
}
