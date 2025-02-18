package upskill.ebay.pageAction;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

//	public void searchShoes(){
//		//explicitly wait
//EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
//		
//		//Explicit Wait
//		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
//		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomePageLocatorsObj.btnSearch));
//		
//		EbayHomePageLocatorsObj.btnSearch.click();
//	}
	
	public void searchShoes() throws Exception{
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keys.CLEAR);
		Thread.sleep(5000);
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		Thread.sleep(5000);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.DOWN);
		Thread.sleep(5000);
//		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.DOWN);
//		Thread.sleep(5000);
//		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.UP);
//		Thread.sleep(5000);
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
		
		
//		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");//sendKeys() is a method provided by the WebElement interface.
//		EbayHomePageLocatorsObj.btnSearch.click();
	
	public void searchShirts(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shirts");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void searchPants(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Pants");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void searchItems(String items){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void searchStarwars(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Starwars");
	
	}
	public void categoryDropDown() throws Exception{
		Select dropDown=new Select(EbayHomePageLocatorsObj.ddCategory);
		dropDown.selectByVisibleText("Books");
		Thread.sleep(5000);
		dropDown.selectByValue("625");
		Thread.sleep(5000);
		dropDown.selectByIndex(9);
		Thread.sleep(5000);
	}
	public void categoryDropDownByText(String text) throws Exception{
		Select dropDown=new Select(EbayHomePageLocatorsObj.ddCategory);
		dropDown.selectByVisibleText(text);
		Thread.sleep(5000);
	
	}
	public void clickSearch(){
		EbayHomePageLocatorsObj.btnSearch.click();
		
	}
	public void searchKeyword(String keyword){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(keyword);
		
	}
	
	public void mouseHoverEbay() throws InterruptedException{
		Actions actions=new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(5000);

	}
	public void clickSummary() throws Exception{
		EbayHomePageLocatorsObj.linkSummary.isEnabled();
		EbayHomePageLocatorsObj.linkSummary.click();
		Thread.sleep(5000);
	}
	
	public void keyboardKeys(){
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.UP);
		EbayHomePageLocatorsObj.ddCategory.sendKeys(Keys.DOWN);
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keys.CLEAR);
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Keys.DELETE);

		
	}
	public void handleAlert(){
		SetupDrivers.driver.switchTo().alert().accept();
		SetupDrivers.driver.switchTo().alert().dismiss();
		SetupDrivers.driver.switchTo().alert().sendKeys("Good Service");
		SetupDrivers.driver.switchTo().alert().getText();
	}
	
}