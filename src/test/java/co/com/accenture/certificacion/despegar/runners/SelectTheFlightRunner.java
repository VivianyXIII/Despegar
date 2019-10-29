package co.com.accenture.certificacion.despegar.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		features="src\\test\\resources\\features\\select_the_flight.feature",
		glue="co.com.accenture.certificacion.despegar.stepdefinitions",
		snippets= SnippetType.CAMELCASE
		)

public class SelectTheFlightRunner {

}
