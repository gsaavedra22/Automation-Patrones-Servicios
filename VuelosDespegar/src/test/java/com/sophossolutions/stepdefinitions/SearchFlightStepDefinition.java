package com.sophossolutions.stepdefinitions;

import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchFlightStepDefinition {
	
	@Before
	public void stage() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("i must be in the page {string}")
	public void iMustBeInThePage(String url) {
	  OnStage.theActorCalled("geral").wasAbleTo(Open.url(Constants.getData(url)));
	}
	@When("enter flight data")
	public void enterFlightData(io.cucumber.datatable.DataTable dataTable) {
	   System.out.println("when");
	}
	@Then("I validate the outcomes")
	public void iValidateTheOutcomes() {
		System.out.println("then");
	}
}
