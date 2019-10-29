package co.com.accenture.certificacion.despegar.tasks;

import co.com.accenture.certificacion.despegar.userinterfaces.SelectTheRate;
import co.com.accenture.certificacion.despegar.utils.LoadDataTxt;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillInData implements Task {

	
	private LoadDataTxt loaddata= new LoadDataTxt();

	@Override
	public <T extends Actor> void performAs(T actor) {
		String[] file= loaddata.leerTxt();
		
		actor.attemptsTo(Click.on(SelectTheRate.NOMBRE),
							Enter.theValue(file[0]).into(SelectTheRate.NOMBRE),
							Click.on(SelectTheRate.APELLIDO),
							Enter.theValue(file[1]).into(SelectTheRate.APELLIDO),
							Click.on(SelectTheRate.CEDULA),
							Enter.theValue(file[2]).into(SelectTheRate.CEDULA),
							Click.on(SelectTheRate.BUTTON_BUY));
		
		
	}
	
	
	public static FillInData withTheInformation() {
		return instrumented(FillInData.class);
	}
	
	
}
