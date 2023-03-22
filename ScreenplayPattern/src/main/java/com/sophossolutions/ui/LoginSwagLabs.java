package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginSwagLabs extends PageObject {
	
	public static Target txtusername = Target.the("campo de nombre de usuario").locatedBy("//input[@id='user-name']");
	public static Target txtPassword = Target.the("campo de contraseña de usuario").locatedBy("//input[@id='password']");
	public static Target btnlogin = Target.the("boton de login ").locatedBy("//input[@id='login-button']");

}
