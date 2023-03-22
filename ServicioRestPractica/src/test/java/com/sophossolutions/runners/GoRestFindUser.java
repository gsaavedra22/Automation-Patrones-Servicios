package com.sophossolutions.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophosolutions.stepdefinitions", 
		features = "src/test/resources/com/sophossolutions/features/go_rest_get_with_token_find_user.feature",
		snippets = SnippetType.CAMELCASE

)
public class GoRestFindUser {

}
