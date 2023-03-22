package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class GuruLoginTours extends PageObject {
	

	By userNameTours = By.name("userName");
	By passwordTours = By.name("password");
	By submitTours = By.name("submit");

	
	public void navegarTours(String url) {
		getDriver().navigate().to(url);
	}
	
	public void loginTours(String userNameTours, String passwordTours ) {
		Action.sendData(getDriver(), this.userNameTours, "userGeral");
		Action.sendData(getDriver(), this.passwordTours, "9876g");
		Action.clickButton(getDriver(), submitTours);
		
	}
}
