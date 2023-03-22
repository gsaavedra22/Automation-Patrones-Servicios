package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Action;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class ToursFlight extends PageObject {

	By linkReservation = By.xpath("//a[contains(text(), 'Flights')]");
	By btnRoundTrip = By.xpath("//b//input[@name='tripType'][2]");
	By listpassngers= By.xpath("//td//b//select[@name='passCount']");
	By listDpearting= By.xpath("//td//select[@name='fromPort']");	
	By listmonth= By.xpath("//td//select[@name='fromMonth']");
	By listday= By.xpath("//td//select[@name='fromDay']");
	By listArriving= By.xpath("//td//select[@name='toPort']");
	By returnMonth= By.xpath("//td//select[@name='toMonth']");
	By returnDay= By.xpath("//td//select[@name='toDay']");
	By servicesClass= By.xpath("//td//input[@name='servClass'][2]");
	By airline= By.xpath("//td//select[@name='airline']");
	By btnContinue= By.xpath("//td//input[@name='findFlights']");
    
	
	public void navegar(String url) {
		getDriver().navigate().to(url);
		
	}
	public void reservationFlight() {
		Action.clickButton(getDriver(), linkReservation);
//		Action.clickButton(getDriver(), btnRoundTrip);
		Action.selectFromOption(getDriver(),"2",this.listpassngers );
		Action.selectFromOption(getDriver(), "New York", this.listDpearting);
		Action.selectFromOption(getDriver(), "March", this.listmonth);
		Action.selectFromOption(getDriver(), "7", this.listday);
		Action.selectFromOption(getDriver(), "Portland", this.listArriving);
//		Action.clickButton(getDriver(), returnMonth);
//		Action.clickButton(getDriver(), returnDay);
//		Action.clickButton(getDriver(), servicesClass);
//		Action.clickButton(getDriver(), airline);
//		Action.clickButton(getDriver(), btnContinue);
	}
	
	
}
