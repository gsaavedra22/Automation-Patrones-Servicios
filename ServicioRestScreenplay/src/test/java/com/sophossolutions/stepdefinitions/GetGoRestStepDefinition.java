package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.ExecuteGet;
import com.sophossolutions.utils.Constants;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import org.hamcrest.CoreMatchers;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetGoRestStepDefinition {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	@Given("Dado que {string} establece la base url {string} del servicio")
	public void dadoQueEstableceLaBaseUrlDelServicio(String actorName, String baseUrl) {
		OnStage.theActorCalled(actorName).whoCan(CallAnApi.at(Constants.getData(baseUrl)));
	}

	@When("Consulta el endpoint {string} y el id {string}")
	public void consultaElEndpointYElId(String endPoint, String IdUser) {
	OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withtokens(Constants.getData(endPoint), IdUser));
	}

	@Then("Validar que el status sea {int} y que la respuesta contenga toda la informacion del usuario")
	public void validarQueElStatusSeaYQueLaRespuestaContengaTodaLaInformacionDelUsuario(Integer intStatusCode,
			DataTable dataTable) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)
				.body("name", CoreMatchers.equalTo("Charuchandra Naik"))));
		
	}
}
