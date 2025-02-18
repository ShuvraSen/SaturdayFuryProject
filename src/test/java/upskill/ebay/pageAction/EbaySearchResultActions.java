package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;

	public EbaySearchResultActions() {
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}

	public void verifyShoesItems() {

		// Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());// testng
		// SoftAssert softAssert = new SoftAssert();
		// softAssert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed(),

		// Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());

		// Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}

	public void verifyShirtsItems() {

		// Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());

		// Option 2
		// System.out.println(EbaySearchResultLocatorsObj.txtShirt.getText());
		Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		// Option 3
		EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
	}

	public void verifyPantsItems() {

		// Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());

		// Option 2
		Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		// Option 3
		EbaySearchResultLocatorsObj.txtPants.isDisplayed();
	}

	public void filterBrand(String brand) {

		if (brand.equals("Nike")) {
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if (brand.equals("Unbranded")) {
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		} else if (brand.equals("Adidas")) {
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else {
			System.out.println("no brand found");
		}

	}

	public void verifyBrandItems(String brand) {

		if (brand.equals("Nike")) {
			Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		} else if (brand.equals("Unbranded")) {
			Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		} else if (brand.equals("Adidas")) {
			Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		} else {
			System.out.println("no brand found");
		}
	}
	public void filterSize(String size) {
		
		if (size.equals("10")) {
			EbaySearchResultLocatorsObj.cbxSize10.click();
		} else if (size.equals("L")) {
			EbaySearchResultLocatorsObj.cbxSizeLShirts.click();
		} else if (size.equals("Tall")) {
			EbaySearchResultLocatorsObj.cbxTallPants.click();
		} else {
			System.out.println("no size found");
		}
		
	}
	
	public void verifySizeItems(String size) {
		
		if (size.equals("10")) {
			Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		} else if (size.equals("L")) {
			Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
		} else if (size.equals("Tall")) {
			Assert.assertEquals("Pants", EbaySearchResultLocatorsObj.txtPants.getText());
		} else {
			System.out.println("no brand found");
		}
	}
	public void verifyBillie() {
		Assert.assertEquals("Billie", EbaySearchResultLocatorsObj.txtBillie.getText());
		
	}
	public void verifyHawaii() {
		Assert.assertEquals("Hawaii", EbaySearchResultLocatorsObj.txtHawaii.getText());
		
	}
	public void verifyStarwars() {
		Assert.assertEquals("Starwars", EbaySearchResultLocatorsObj.txtStarwars.getText());
		
	}
}
