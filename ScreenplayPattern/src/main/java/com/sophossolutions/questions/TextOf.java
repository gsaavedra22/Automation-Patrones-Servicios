package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TextOf implements Question<String> {

	Target txtmensaje;

	public TextOf(Target txtmensaje) {
		this.txtmensaje = txtmensaje;
	}

	@Override
	public String answeredBy(Actor actor) {
		actor.wasAbleTo(WaitUntil.the(txtmensaje, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
		return Text.of(txtmensaje).answeredBy(actor);
	}

	public static TextOf field(Target txtmensaje) {

		return new TextOf(txtmensaje);
	}

}
