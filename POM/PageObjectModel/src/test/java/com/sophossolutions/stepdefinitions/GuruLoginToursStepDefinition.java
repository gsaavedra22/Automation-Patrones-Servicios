package com.sophossolutions.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.GuruHomeTours;
import com.sophossolutions.pages.GuruLoginTours;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginToursStepDefinition {
	WebDriver myBrowser;
	GuruLoginTours gurulogintours;
	GuruHomeTours guruhometours;

	@Given("El usuario debe estar en la pagina gurunesTours")
	public void elUsuarioDebeEstarEnLaPaginaGurunesTours() {
		gurulogintours.navegarTours("https://demo.guru99.com/test/newtours/");

	}

	@When("Ingresar credenciales y se loguea {string},{string}")
	public void ingresarCredencialesYSeLoguea(String string, String string2) {
		gurulogintours.loginTours(string, string2);
	}

	@Then("validate login succesfully tours {string}")
	public void validateLoginSuccesfullyTours(String string) {
		guruhometours.validateTextTours(string);
		System.out.println("Prueba exitosa");
	}

}
