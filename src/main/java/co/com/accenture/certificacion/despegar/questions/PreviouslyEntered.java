package co.com.accenture.certificacion.despegar.questions;

import co.com.accenture.certificacion.despegar.userinterfaces.SelectTheRate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PreviouslyEntered implements Question<Boolean>{

	
	
	
	@Override
	public Boolean answeredBy(Actor actor) {
		if (Text.of(SelectTheRate.TEXTO).viewedBy(actor).asString().contains("Elige la tarjeta con la que quieres pagar")) {
		return true;
		}else {
			return false;
		}
	}

	public static Question<Boolean> data(){
		return new PreviouslyEntered();
	}
}
