package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageGuru99 extends PageObject {
	public static Target lblmensaje = Target.the("mensaje de inicio con id").locatedBy("//td[contains(text(), 'Manger')]");

}
