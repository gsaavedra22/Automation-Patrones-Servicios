package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchFlight {
	
	
	public static Target txtDestino = Target.the("Campo de Destino").locatedBy("//div//input[@name='ss']");
	public static Target txtFechaIda = Target.the("Fecha de Ida").locatedBy(" //input[@placeholder='Ida'] ");
	public static Target txtFechaVuelta = Target.the("Fecha de Vuelta").locatedBy(" //input[@placeholder='Vuelta'] ");
	public static Target btnPasajeros = Target.the("botón pasajeros y clase").locatedBy(" //label[contains(text(),'Pasajeros y Clase')]");
	
}
