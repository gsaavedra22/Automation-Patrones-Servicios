package com.sophossolutions.task;

import com.sophossolutions.ui.LoginSwagLabs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SendLoginSwagLabs implements Task {

	String userName;
	String password;
	Target target;

	public SendLoginSwagLabs(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public SendLoginSwagLabs(Target targets) {
		this.target = targets;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(userName).into(LoginSwagLabs.txtusername),
				Enter.theValue(password).into(LoginSwagLabs.txtPassword), Click.on(LoginSwagLabs.btnlogin));

	}

	public static SendLoginSwagLabs form(String userName, String password) {
		return Tasks.instrumented(SendLoginSwagLabs.class, userName, password);

	}

}
