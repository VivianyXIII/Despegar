package co.com.accenture.certificacion.despegar.tasks;

import java.util.List;

import co.com.accenture.certificacion.despegar.interactions.Scroll;
import co.com.accenture.certificacion.despegar.interactions.WaitSeconds;
import co.com.accenture.certificacion.despegar.userinterfaces.FlightDespegar;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InsertTheData implements Task {

	private List<List<String>> data;

	public InsertTheData(List<List<String>> data) {

		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(FlightDespegar.FLIGHT), Click.on(FlightDespegar.SOURCE_CITY),
				Enter.theValue(data.get(1).get(0)).into(FlightDespegar.SOURCE_CITY),
				Click.on(FlightDespegar.CHOOSE_SOURCE_CITY), Click.on(FlightDespegar.TARGET_CITY),
				Enter.theValue(data.get(1).get(1)).into(FlightDespegar.TARGET_CITY),
				Click.on(FlightDespegar.CHOOSE_TARGET_CITY),

				Click.on(FlightDespegar.DEPARTURE_DATE),
				Click.on(FlightDespegar.CHOOSE_DAY_DEPARTURE.of(data.get(1).get(2))));

				//WaitSeconds.inThePage(20));

		actor.attemptsTo(Click.on(FlightDespegar.CHOOSE_DAY_RETURN.of(data.get(1).get(3))),
				// WaitSeconds.inThePage(20),
				Click.on(FlightDespegar.SEARCH));
		
		WaitUntil.the(FlightDespegar.TITLE, isVisible());
		actor.attemptsTo( WaitSeconds.inThePage(10),Scroll.to(FlightDespegar.SELECT),
				
				Click.on(FlightDespegar.SELECT), WaitSeconds.inThePage(50));
				//

	}

	public static InsertTheData inThePage(List<List<String>> data) {

		return Tasks.instrumented(InsertTheData.class, data);
		// Instrumented por debajo llama el contructor de la clase que se ajuste a los
		// parametros
		// retun new OpenTheBrowser(page);
	}

}
