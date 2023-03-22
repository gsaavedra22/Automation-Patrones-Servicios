package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruHomeTours extends PageObject {
	
	By textlogin = By.xpath("//b[contains(text(), 'Thank you')]");
	
	public void validateTextTours(String textlogin) {
		assertEquals("Texto Fallido",textlogin , Action.getText(getDriver(), this.textlogin) );
	}

}
