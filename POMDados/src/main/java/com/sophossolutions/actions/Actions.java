package com.sophossolutions.actions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Actions {

	public static void sendData(WebDriver myBrowser, By target,String data) {
		myBrowser.findElement(target).sendKeys(data);
	}
	public static void clickButton(WebDriver myBrowser,By target) {
		myBrowser.findElement(target).click();
	}
	public static String getText(WebDriver myBrowser, By target) {
		return myBrowser.findElement(target).getText();
	}
	
	public static void selectFromOption(WebDriver myBrowser, String opcion, By target) {
		WebElement listaSelect = myBrowser.findElement(target);
		Select select = new Select(listaSelect);
		select.selectByVisibleText(opcion);
	}
	public static void inputNumberGuess(WebDriver myBrowser, By target) {
	Random random = new Random();
	int numberRandom= random.nextInt(5);
	myBrowser.findElement(target).sendKeys(String.valueOf(numberRandom));
	}
}

