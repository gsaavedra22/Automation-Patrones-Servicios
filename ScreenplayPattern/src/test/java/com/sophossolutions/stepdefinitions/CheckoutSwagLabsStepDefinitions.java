package com.sophossolutions.stepdefinitions;

import com.sophossolutions.interactions.getTextCheckout;
import com.sophossolutions.task.CheckoutProducts;

import com.sophossolutions.ui.CheckoutSwagLabs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class CheckoutSwagLabsStepDefinitions {
	@Before
	public void stage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("i must be login in the swag labs")
	public void iMustBeLoginInTheSwagLabs() {

		OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(CheckoutSwagLabs.btncart));
	}

	@When("I send information for the purchase")
	public void iSendInformationForThePurchase(DataTable dataTable) {

		OnStage.theActorInTheSpotlight().wasAbleTo(CheckoutProducts.formcheckout(dataTable));

	
	
	}
	@When("show information in console")
	public void showInformationInConsole() {
		OnStage.theActorInTheSpotlight().wasAbleTo(
				getTextCheckout.getData());
		getTextCheckout.printData(OnStage.theActorInTheSpotlight());
	}

	@Then("I validate the message {string}")
	public void iValidateTheMessage(String string) {

	}
}