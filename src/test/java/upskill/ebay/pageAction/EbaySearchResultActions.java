package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed(),
		
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
	
	
	public void verifyShirtsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirt.isDisplayed());
		
		//Option 2
		//System.out.println(EbaySearchResultLocatorsObj.txtShirt.getText());
		Assert.assertEquals("shirt", EbaySearchResultLocatorsObj.txtShirt.getText());
		//Option 3
		EbaySearchResultLocatorsObj.txtShirt.isDisplayed();
	}
}
