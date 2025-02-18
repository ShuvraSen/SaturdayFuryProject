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
	
	@Then("^items list should display the pants products$")
	public void items_list_should_display_the_pants_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbaySearchResultActionsobj.verifyPantsItems();
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
	   EbaySearchResultActionsobj.filterBrand(brand);
	   //the reason When is here---brand name will shown up after the items are searched. 
	   //it is not in home page    
	}
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionsobj.verifyBrandItems(brand);
	}
	@When("^User select \"([^\"]*)\"$")
	public void user_select(String size) throws Throwable {
		EbaySearchResultActionsobj.filterSize(size);
	}

	@Then("^Item list should have size of \"([^\"]*)\"$")
	public void item_list_should_have_size_of(String size) throws Throwable {
		EbaySearchResultActionsobj.verifySizeItems(size);
	}
//	@When("^User select \"([^\"]*)\"$")
//	public void user_select(String size) throws Throwable {
//	   
//	}
	
//	@Then("^Item list should have size of \"([^\"]*)\"$")
//	public void item_list_should_have_size_of(String size) throws Throwable {
//	    
//	}
	
	@Then("^Item list should have Starwars related Books$")
	public void item_list_should_have_Starwars_related_Books() throws Throwable {
		EbaySearchResultActionsobj.verifyStarwars();
	}
	@Then("^Item list should have Billie related Music$")
	public void item_list_should_have_Billie_related_Music() throws Throwable {
		EbaySearchResultActionsobj.verifyBillie();
	}
	@Then("^Item list should have Hawaii related Travel$")
	public void item_list_should_have_Hawaii_related_Travel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbaySearchResultActionsobj.verifyHawaii();
	}
	//mouse hover
	//it will not come as it will perform in homepage


}
