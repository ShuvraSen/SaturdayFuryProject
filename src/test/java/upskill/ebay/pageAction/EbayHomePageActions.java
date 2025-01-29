package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}
	//PageFactory is a class in Selenium that helps implement 
	//the Page Object Model (POM) design pattern. 
	//it help to manage the set up the webdriver
	//we use the PageFactory class to initialize the driver

	public void searchShoes(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");//sendKeys() is a method provided by the WebElement interface.
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void searchShirts(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("shirt");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
}