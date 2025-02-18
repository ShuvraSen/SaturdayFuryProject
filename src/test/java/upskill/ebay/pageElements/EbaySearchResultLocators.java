package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;
	
	//Validate Pants Items
	@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
	public WebElement txtPants;
		
	//Validate Shirts Items
	@FindBy(xpath="//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;	
	
	//Checkbox Brand Adidas
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;

	//Checkbox Brand Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;

	//Checkbox Brand Unbranded
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	//========
	
//	//input[@aria-label="10"]
	//checkbox for size10
	@FindBy(xpath="//input[@aria-label='10']")
	public WebElement cbxSize10;
	
	//span[contains(@class, 'size-component--label') and contains(text(), 'L')])[1]
	////body/div[5]/div[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]
	@FindBy(xpath="//body/div[5]/div[3]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]")
	public WebElement cbxSizeLShirts;
	
//	//input[@aria-label='Tall']
	@FindBy(xpath="//input[@aria-label='Tall']")
	public WebElement cbxTallPants;
	//=======
	
	//Validate Starwars Items
		@FindBy(xpath="//span[2][contains(text(), 'Starwars')]")
		public WebElement txtStarwars;
		//Validate Billie Items
		@FindBy(xpath="//span[2][contains(text(), 'Billie')]")
		public WebElement txtBillie;
		//Validate Hawaii Items
		@FindBy(xpath="//span[2][contains(text(), 'Hawaii')]")
		public WebElement txtHawaii;
	
}