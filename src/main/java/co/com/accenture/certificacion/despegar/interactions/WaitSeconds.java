package co.com.accenture.certificacion.despegar.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitSeconds extends PageObject implements Interaction {

    private int seconds;

   

    public WaitSeconds(int seconds) {
		super();
		this.seconds = seconds;
	}

	
    @Override
	public <T extends Actor> void performAs(T actor) {
    	waitFor(seconds).seconds();
		
	}


	public static WaitSeconds inThePage(int seconds) {
        return Tasks.instrumented(WaitSeconds.class, seconds);
    }
}