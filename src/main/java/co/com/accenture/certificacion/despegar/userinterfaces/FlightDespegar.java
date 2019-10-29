package co.com.accenture.certificacion.despegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightDespegar extends PageObject {
	
	public static final Target FLIGHT = Target.the("Select the option flight").locatedBy("//*[@class='shifu-3-icon-flights']");
	public static final Target SOURCE_CITY = Target.the("Select the source city").locatedBy("//*[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline']");
	public static final Target CHOOSE_SOURCE_CITY= Target.the("Select the source city").locatedBy("//*[@class='item -active']");
	public static final Target TARGET_CITY = Target.the("Select the target city").locatedBy("//*[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline']");
	public static final Target CHOOSE_TARGET_CITY= Target.the("Select the target city").locatedBy("//*[@class='item-text']");
	
	
	public static final Target DEPARTURE_DATE = Target.the("Select the departure date").locatedBy("//*[@class='input-tag sbox-bind-disable-start-date sbox-bind-value-start-date-segment-1 sbox-bind-reference-flight-start-date-input ']");
	public static final Target CHOOSE_DAY_DEPARTURE= Target.the("Select the departure day").locatedBy("//div[@class='_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show']//div[@class='_dpmg2--month _dpmg2--o-5']//span[@class='_dpmg2--date _dpmg2--available _dpmg2--weekend']//span[@class='_dpmg2--date-number'][contains(text(),'{0}')]");
			//.locatedBy("//div[@class='_dpmg2--month _dpmg2--o-5 _dpmg2--has-end-range']//span[@class='_dpmg2--date-number'][contains(text(),'{0}')]");
	
	//public static final Target RETURN_DATE = Target.the("Select the return date").locatedBy("//input[@placeholder='Vuelta']");
	public static final Target CHOOSE_DAY_RETURN= Target.the("Select the return day").locatedBy("//div[@class='_dpmg2--month _dpmg2--o-7']//span[@class='_dpmg2--date _dpmg2--available _dpmg2--weekend _dpmg2--nights-tooltip _dpmg2--days--modifier']//span[@class='_dpmg2--date-number'][contains(text(),'{0}')]");
	
	public static final Target SEARCH= Target.the("Select the search button").locatedBy("//*[@class='sbox-button -ml3-l -mt5-l']");
	
    public static final Target TITLE= Target.the("See title cheaper flight").locatedBy("//*[@class='sbox-title-container -mb5 -hide-in-modal']");
    public static final Target SELECT =Target.the("Select the flight").locatedBy("(//*[@class='-md eva-3-btn -primary'])[1]");
    //-md eva-3-btn -primary
    
    
//
}
