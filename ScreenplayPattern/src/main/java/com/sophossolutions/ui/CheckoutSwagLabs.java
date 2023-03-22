package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class CheckoutSwagLabs extends PageObject {
	public static Target btncart = Target.the("Botón del carrito").locatedBy("//a[@class='shopping_cart_link']");
	public static Target btnCheckout = Target.the("botón the checkout").locatedBy("//button[@id='checkout']");
	public static Target txtFirstName = Target.the("campo de first name").locatedBy("//input[@id='first-name']");
	public static Target txtLastName = Target.the("campo de last name").locatedBy("//input[@id='last-name']");
	public static Target txtPostalCode = Target.the("campo de codigo postal").locatedBy("//input[@id='postal-code']");
	public static Target btnContinue = Target.the("Botón de continuar").locatedBy("//input[@id='continue']");
	public static Target btnFinish = Target.the("Botón de Finish").locatedBy("//button[@id='finish']");
	public static Target lblSauceCard = Target.the("Texto codigo de compra").locatedBy(" //div[@class='summary_info_label summary_total_label']");
	public static Target lblSubtotal = Target.the("Texto codigo de compra").locatedBy("//div[@class='summary_subtotal_label']");
	public static Target lblTax= Target.the("Texto codigo de compra").locatedBy("//div[@class='summary_tax_label']");
	public static Target lblTotal= Target.the("Texto codigo de compra").locatedBy("//div[@class='summary_total_label']");
	
 
}
