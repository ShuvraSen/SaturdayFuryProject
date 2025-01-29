package upskill.ebay.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsobj=new EbaySearchResultActions();
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbaySearchResultActionsobj.verifyShoesItems();
	}

	@Then("^items list should display the related products$")
	public void items_list_should_display_the_related_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbaySearchResultActionsobj.verifyShirtsItems();
	}
	
	

}
