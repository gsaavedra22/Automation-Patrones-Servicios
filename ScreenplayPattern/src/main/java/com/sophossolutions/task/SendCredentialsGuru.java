package com.sophossolutions.task;

import com.sophossolutions.ui.GuruLogin;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SendCredentialsGuru implements Task {
	Target targ;
	String user;
	String password;

	public SendCredentialsGuru(String user, String password) {
		this.user= user;
		this.password= password;

	}

	public SendCredentialsGuru(Target target) {
		this.targ= target;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(GuruLogin.txtUserID),
				Enter.theValue(password).into(GuruLogin.txtPassword), Click.on(GuruLogin.btnLogin)

		);

	}

	public static SendCredentialsGuru with() {
		return Tasks.instrumented(SendCredentialsGuru.class,"hola");
	}
	
	public static SendCredentialsGuru form(String user, String password) {
		
		return Tasks.instrumented(SendCredentialsGuru.class,user,password);
	}

}
