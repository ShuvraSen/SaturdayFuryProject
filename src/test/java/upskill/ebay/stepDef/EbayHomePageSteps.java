package upskill.ebay.stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;
import upskill.utilities.SetupDrivers;

public class EbayHomePageSteps {
	EbayHomePageActions EbayHomePageActionsobj=new EbayHomePageActions();
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SetupDrivers.driver.get("https://www.ebay.com");
	    
	}
	
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsobj.searchShoes();

	  
	}
	
	@Given("^Open the Ebay Homepage$")
	public void open_the_Ebay_Homepage() throws Throwable {
		SetupDrivers.driver.get("https://www.ebay.com");
	   
	}

	@When("^search for shirts$")
	public void search_for_shirts() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbayHomePageActionsobj.searchShirts();
	}

}
