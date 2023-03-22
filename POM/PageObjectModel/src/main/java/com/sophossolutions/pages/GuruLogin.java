package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/v4/")
public class GuruLogin extends PageObject{
	By userName = By.name("uid");
	By password= By.name("password");
	By btnClick= By.name("btnLogin");
	
	public void navegar(String url) {
		getDriver().navigate().to(url);
	}
	public void login(String userName , String password) {
		Action.sendData(getDriver(), this.userName, "mngr480448");
		Action.sendData(getDriver(), this.password, "pynevYp");
		Action.clickButton(getDriver(), btnClick);
	}
}
