package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageTours extends PageObject {

	public static Target lblbienvenida = Target.the("mensaje de login exitoso").locatedBy("//h3[contains(text(),\"Login\")]"); 
}
