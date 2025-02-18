package upskill.ebay.stepDef;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
	
//	@Given("^Open the Ebay Homepage$")
//	public void open_the_Ebay_Homepage() throws Throwable {
//		SetupDrivers.driver.get("https://www.ebay.com");
//	   
//	}

	@When("^search for shirts$")
	public void search_for_shirts() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbayHomePageActionsobj.searchShirts();
		
	}
	@When("^search for pants$")
	public void search_for_pants() throws Throwable {
		EbayHomePageActionsobj.searchPants();
	}
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
	   EbayHomePageActionsobj.searchItems(items);
	    
	}
	
	
	
	
//	dropdown
	@Given("^User type Starwars in Search text box$")
	public void user_type_Starwars_in_Search_text_box() throws Throwable {
		EbayHomePageActionsobj.searchStarwars();
	}

	@When("^Select Book from Category dropdown$")
	public void select_Book_from_Category_dropdown() throws Throwable {
		EbayHomePageActionsobj.categoryDropDown();
	}

	@When("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		EbayHomePageActionsobj.clickSearch();//dropdown click
	}
	
	@Given("^User type Billie in Search text box$")
	public void user_type_Billie_in_Search_text_box() throws Throwable {
		EbayHomePageActionsobj.searchKeyword("Billie");
	}
	
	@When("^Select Music from Category dropdown$")
	public void select_Music_from_Category_dropdown() throws Throwable {
		EbayHomePageActionsobj.categoryDropDownByText("Music");
	}
	
	@Given("^User type Hawaii in Search text box$")
	public void user_type_Hawaii_in_Search_text_box() throws Throwable {
		EbayHomePageActionsobj.searchKeyword("Hawaii");
	}

	@When("^Select Travel from Category dropdown$")
	public void select_Travel_from_Category_dropdown() throws Throwable {
		EbayHomePageActionsobj.categoryDropDownByText("Travel");
	}
	//mouse hover
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomePageActionsobj.mouseHoverEbay();

	}
	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomePageActionsobj.clickSummary();
//as it is in homepage

	}
	

}
