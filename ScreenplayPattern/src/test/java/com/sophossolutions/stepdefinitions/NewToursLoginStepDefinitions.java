package com.sophossolutions.stepdefinitions;


import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.HomePageTours;

import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class NewToursLoginStepDefinitions {
	
	@Before
	public void setup(){
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Debe ingresar en la pagina de newTours {string}")
	public void debeIngresarEnLaPaginaDeNewTours(String string) {
		OnStage.theActorCalled("Andres").wasAbleTo(Open.url(Constants.getData(string)));
	}
	@When("Ingresar credenciales {string} {string}")
	public void ingresarCredenciales(String string, String string2) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.form(string , string2));
	}
	@Then("I validate the outcomes {string}")
	public void iValidateTheOutcomes(String string) {

     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(HomePageTours.lblbienvenida), Matchers.equalTo(string)).orComplainWith(UnexpectedResult.class,"El mensaje no coincide con el esperado"));
	}

	
}