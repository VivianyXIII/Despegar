package co.com.accenture.certificacion.despegar.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenDespegar implements Task{

	private PageObject pageDespegar;
	
	public OpenDespegar(PageObject pageDespegar) {
		
		this.pageDespegar = pageDespegar;
	}

@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(Open.browserOn(pageDespegar));
	}


public static OpenDespegar on(PageObject pageDespegar) {
		
		return Tasks.instrumented(OpenDespegar.class, pageDespegar);
		//Instrumented por debajo llama el contructor de la clase que se ajuste a los parametros
		//retun new OpenTheBrowser(page);
	}


	

	
	
}
