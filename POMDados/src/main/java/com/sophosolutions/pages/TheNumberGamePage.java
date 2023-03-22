package com.sophosolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://testsheepnz.github.io/random-number.html")
public class TheNumberGamePage extends PageObject {

	By selectNumber = By.xpath("//div//select[@id='buildNumber']");
	By btnRollTheDice = By.xpath("//div//input[@id='rollDiceButton']");
	By txtNumberGuess = By.xpath("//div//input[@id='numberGuess']");
	By btnsubmit = By.xpath("//div//input[@id='submitButton']");
	By lblCorrect = By.xpath("//div//b//i[contains(text(),'Correct, it took 1 turns!')]");

	public void navegar(String url) {
		getDriver().navigate().to(url);

	}

	public void rollnumbergame(String opcion) {
		Actions.selectFromOption(getDriver(), opcion , this.selectNumber);
		

	}
	
	public void validateTextDice(String msjCorrect) {
		assertEquals("No se encuentra", lblCorrect, Actions.getText(getDriver(), this.lblCorrect));
	}
	
	public void inputnumberGuess() {
		Actions.inputNumberGuess(getDriver(), this.txtNumberGuess);
	}
	
}
