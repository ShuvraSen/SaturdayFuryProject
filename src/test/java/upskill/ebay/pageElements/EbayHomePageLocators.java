package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	//searchInput
	@FindBy(xpath="//input[@placeholder='Search for anything']")//here we locate the search box webelement xpath
	public WebElement txtbxSearch;
	//@FindBy is an annotation from the Selenium PageFactory framework.
	//WebElement is a class in Selenium that represents an HTML element on a web page.
	//we use the page factory patern to write the xpath
	//WebElement is indeed a data type in Selenium.and txtbxSearch is a variable that reprents the search box xpath reference
	
	
	
	//searchBtn
	@FindBy(xpath="//span[text()='Search']")
	public WebElement btnSearch;
	
	
}
