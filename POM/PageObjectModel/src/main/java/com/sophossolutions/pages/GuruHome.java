package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject {
	By text = By.xpath("//td[contains(text(), 'Manger Id')]");
	
	public void validateText(String text) {
		assertEquals("Fallido", text, Action.getText(getDriver(), this.text));
		
	}

}
