package com.sophossolutions.stepdefinitions;

import com.sophossolutions.task.SendLoginSwagLabs;
import com.sophossolutions.utils.ConstantLoginSwagLabs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginSwagLabsStepDefinitions {
	
	@Before
	public void stage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("I must be in the page swag labs {string}")
	public void iMustBeInThePageSwagLabs(String string) {
	    OnStage.theActor("automator").wasAbleTo(Open.url(ConstantLoginSwagLabs.getData(string)));
	}
	@When("I send credentials {string} {string}")
	public void iSendCredentials(String user, String password) {
	   OnStage.theActorInTheSpotlight().wasAbleTo(SendLoginSwagLabs.form(user, password));
	}
	@Then("I validate the successful login text {string}")
	public void iValidateTheSuccessfulLoginText(String string) {
	   System.out.println("Estoy en el then");
	}
}
