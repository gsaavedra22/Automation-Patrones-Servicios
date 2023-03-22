package com.sophossolutions.interactions;

import com.sophossolutions.models.DataCheckout;
import com.sophossolutions.ui.CheckoutSwagLabs;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.targets.Target;

public class getTextCheckout implements Interaction {

	Target txtSauceCard;
	Target txtSubTotal;
	Target txtTax;
	Target txtTotal;
	



	public getTextCheckout(Target txtSauceCard, Target txtSubTotal, Target txtTax, Target txtTotal) {
		super();
		this.txtSauceCard = txtSauceCard;
		this.txtSubTotal = txtSubTotal;
		this.txtTax = txtTax;
		this.txtTotal = txtTotal;
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		WebElementFacade element = txtSauceCard.resolveFor(actor);

		actor.remember("InfoCompra", new DataCheckout(element.getText(), element.getText(),
				element.getText(), element.getText()));

	}
	
	public static getTextCheckout getData() {

		return Tasks.instrumented(getTextCheckout.class, CheckoutSwagLabs.lblSauceCard, 
				CheckoutSwagLabs.lblSubtotal, CheckoutSwagLabs.lblTax, 
				CheckoutSwagLabs.lblTotal);
	}
	
	public static <T extends Actor> void printData(T actor) {
		getTextCheckout inforCheckout = actor.recall("InfoCompra");
		System.out.println(inforCheckout);
	}
}
