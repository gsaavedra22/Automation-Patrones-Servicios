package com.sophosolutions.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.sophosolutions.pages.TheNumberGamePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class NumberGameDiceStepDefinitions {
	TheNumberGamePage thenumberpage;
	@Managed // redirecciona la configuracion .properties
	WebDriver myBrowser;

	@Given("Dado que me encuentro en la pagina {string}")
	public void dadoQueMeEncuentroEnLaPagina(String string) {
		thenumberpage.navegar("https://testsheepnz.github.io/random-number.html");
	}

	@When("hago roll con cantidad {String}")
	public void hagoRollConCantidad(String number) {
		thenumberpage.rollnumbergame(number);
		thenumberpage.inputnumberGuess();
	}

	@Then("veo el mensaje Correct {string}")
	public void veoElMensajeCorrect(String MsjCorrect) {
		thenumberpage.validateTextDice(MsjCorrect);
	}
}
