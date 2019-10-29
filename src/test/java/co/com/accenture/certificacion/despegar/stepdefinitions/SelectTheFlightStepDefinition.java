package co.com.accenture.certificacion.despegar.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.accenture.certificacion.despegar.questions.PreviouslyEntered;
import co.com.accenture.certificacion.despegar.tasks.FillInData;
import co.com.accenture.certificacion.despegar.tasks.InsertTheData;
import co.com.accenture.certificacion.despegar.tasks.OpenDespegar;
import co.com.accenture.certificacion.despegar.userinterfaces.DespegarHome;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SelectTheFlightStepDefinition {

	@Managed(driver = "chrome")
	public WebDriver herBrowser;
	private Actor jessica = Actor.named("Jessica");
	private DespegarHome despegarpage;

	@Before
	public void setUp() {
		jessica.can(BrowseTheWeb.with(herBrowser));

	}

	@Given("^that Jessica wants to look for a one way flight$")
	public void thatJessicaWantsToLookForAOneWayFlight() throws Throwable {
		// ingresar a la pagina,
		jessica.wasAbleTo(OpenDespegar.on(despegarpage));
	}

	@When("^She insert the data of the flight$")
	public void sheInsertTheDataOfTheFlight(List<List<String>> data) throws Throwable {
		// insertar los datos
		jessica.attemptsTo(InsertTheData.inThePage(data));
		// theActorInTheSpotlight().attemptsTo(InsertDataOfFlight.inThePage(datos));

	}

	@And("^She fill in her information$")
	public void sheFillInHerInformation() throws Throwable {
		jessica.attemptsTo(FillInData.withTheInformation());
	}

	@Then("^She should see comprar on screen$")
	public void sheShouldSeeComprarOnScreen() throws Throwable {
		jessica.should(seeThat(PreviouslyEntered.data()));
		// jessica.should(seeThat(TheText.ofFollowingTarget(VisibleText.TITLE), containsString(personas)));
	}

}
