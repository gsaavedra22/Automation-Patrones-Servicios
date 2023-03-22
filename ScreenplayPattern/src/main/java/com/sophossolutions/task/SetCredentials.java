package com.sophossolutions.task;

import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetCredentials implements Task {
	Target targ;
	String user;
	String password;

	public SetCredentials(String user, String password) {
		this.user= user;
		this.password= password;

	}

	public SetCredentials(Target target) {
		this.targ= target;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(LoginPage.txtUser),
				Enter.theValue(password).into(LoginPage.txtPassword), Click.on(LoginPage.btnSubmit)

		);

	}

	public static SetCredentials with() {
		return Tasks.instrumented(SetCredentials.class,"hola");
	}
	
	public static SetCredentials form(String user, String password) {
		
		return Tasks.instrumented(SetCredentials.class,user,password);
	}

}
