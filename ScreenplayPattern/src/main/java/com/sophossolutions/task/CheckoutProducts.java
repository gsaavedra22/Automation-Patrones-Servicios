package com.sophossolutions.task;

import java.util.Map;

import com.sophossolutions.ui.CheckoutSwagLabs;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutProducts implements Task {
	
	Target firstName;
	Target lastName;
	Target postalCode;
	String txtFirstName;
	String txtLastName;
	String txtPostalCode;
	


	public CheckoutProducts(Target firstName, Target lastName, Target postalCode, String txtFirstName,
			String txtLastName, String txtPostalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
		this.txtFirstName = txtFirstName;
		this.txtLastName = txtLastName;
		this.txtPostalCode = txtPostalCode;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CheckoutSwagLabs.btncart), Click.on(CheckoutSwagLabs.btnCheckout),
				Enter.theValue(txtFirstName).into(firstName),
				Enter.theValue(txtLastName).into(lastName),
				Enter.theValue(txtPostalCode).into(postalCode),
				
				Click.on(CheckoutSwagLabs.btnContinue), Click.on(CheckoutSwagLabs.btnFinish));

	}

	public static CheckoutProducts formcheckout(DataTable datatable) {

		Map<String, String> data = datatable.asMap(String.class, String.class);

		return Tasks.instrumented(CheckoutProducts.class, CheckoutSwagLabs.txtFirstName,
				CheckoutSwagLabs.txtLastName,CheckoutSwagLabs.txtPostalCode,data.get("First Name"),data.get("Last Name"), data.get("Zip/Postal Code"));

	}

	

}
