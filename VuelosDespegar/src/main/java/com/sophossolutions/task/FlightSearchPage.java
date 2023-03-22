package com.sophossolutions.task;


import com.sophossolutions.ui.SearchFlight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/vuelos/")
public class FlightSearchPage implements Task{

	 
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("campo origen").into(SearchFlight.txtDestino));
		
		
	}
	

}
