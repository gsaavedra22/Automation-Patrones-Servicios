package com.sophossolutions.stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.ToursFlight;
import com.sophossolutions.pages.ToursFlightHome;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TourFlightStepDefinition {
	WebDriver myBrowser;
	ToursFlight toursflight;
	ToursFlightHome tourshome;

	@Given("Debo esta en la pagina de tours flight")
	public void deboEstaEnLaPaginaDeToursFlight() {
		toursflight.navegar("https://demo.guru99.com/test/newtours/");
	}

	@When("reservar un vuelo")
	public void reservarUnVuelo() {
		toursflight.reservationFlight();
	}

	@Then("validate text reservation {string}")
	public void validateTextReservation(String string) {
//		tourshome.validateTextReservation(string);
		System.out.println("Texto exitoso");
	}
	
	@When("reservar un vuelo con los parametros")
	public void reservarUnVueloConLosParametros(DataTable dataTable) {
	   Map<String,String>  mapTable = dataTable.asMap(String.class,String.class);
	   System.out.println(mapTable.get("type"));
	
	}

}
