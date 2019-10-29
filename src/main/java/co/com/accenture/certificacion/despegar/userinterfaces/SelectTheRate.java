package co.com.accenture.certificacion.despegar.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheRate extends PageObject{

	public static final Target NOMBRE = Target.the("Select the name").located(By.id("dpq8eyo84qlvly2445411b"));
	public static final Target APELLIDO = Target.the("Select the last name").located(By.id("s0ziiokzjprzbb0h5aaq8g"));
	public static final Target CEDULA= Target.the("Select the id").located(By.id("traveler-identification-number-0"));
	public static final Target BUTTON_BUY= Target.the("Select on buy button").located(By.id("buy-button")); 
	
	public static final Target TEXTO= Target.the("text element").locatedBy("//span[contains(text(),'Elige la tarjeta con la que quieres pagar')]");
	
	//nombre: //*[@id='dpq8eyo84qlvly2445411b']
	//apellido: //*[@id='s0ziiokzjprzbb0h5aaq8g']
	//cedula: //*[@id='traveler-identification-number-0']
	//boton comprar: //*[@id='buy-button']
}
