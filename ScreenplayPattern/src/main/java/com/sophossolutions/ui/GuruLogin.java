package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class GuruLogin extends PageObject {

	public static Target txtUserID = Target.the("Campo user ID").locatedBy("//input[@name='uid']");
	public static Target txtPassword = Target.the("Campo de password").locatedBy("//input[@name='password']");
	public static Target btnLogin= Target.the("boton de login").locatedBy("//input[@name='btnLogin']");
}
