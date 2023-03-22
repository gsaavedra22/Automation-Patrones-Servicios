package com.sophossolutions.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.GuruHome;
import com.sophossolutions.pages.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinition {
	GuruLogin gurulogin;
	GuruHome guruhome;
	@Managed // redirecciona la configuracion .properties
	WebDriver myBrowser;

	@Given("El usuario debe estar en la pagina de guru99")
	public void elUsuarioDebeEstarEnLaPaginaDeGuru99() {
		gurulogin.navegar("https://demo.guru99.com/v4/");
		System.out.println("Hola estoy en el given");
	}

	@When("Ingresar credenciales y se autentica {string},{string}")
	public void ingresarCredencialesYSeAutentica(String string, String string2) {
	   gurulogin.login(string, string2);
	}

	@Then("Validate text home {string}")
	public void validateTextHome(String string) {
	   guruhome.validateText(string);
	}

}
