package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SendCredentialsGuru;
import com.sophossolutions.ui.HomePageGuru99;

import com.sophossolutions.utils.ConstantGuru;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Guru99LoginStepDefinitions {

	@Before
	public void stageActor() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Estar en la pagina de guru99 {string}")
	public void estarEnLaPaginaDeGuru99(String string) {
		OnStage.theActorCalled("geral").wasAbleTo(Open.url(ConstantGuru.getData(string)));
	}

	@When("Ingresar credenciales para guru99 {string}  {string}")
	public void ingresarCredencialesParaGuru99(String string, String string2) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SendCredentialsGuru.form(string, string2));
	}

	@Then("validar mensaje login exitoso {string}")
	public void validarMensajeLoginExitoso(String string) {
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(TextOf.field(HomePageGuru99.lblmensaje), Matchers.equalTo(string))
						.orComplainWith(UnexpectedResult.class, "El mensaje no es el esperado"));
	}
}
