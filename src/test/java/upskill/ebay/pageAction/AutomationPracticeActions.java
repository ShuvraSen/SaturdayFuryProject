 
package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.AutomationPracticeLocators;
import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class AutomationPracticeActions {
	
	AutomationPracticeLocators AutomationPracticeLocatorsObj;
	
	public AutomationPracticeActions(){
		AutomationPracticeLocatorsObj = new AutomationPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, AutomationPracticeLocatorsObj);
	}
	
	public void loadAutomationPage(){
		SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
	}
	
	public void switchIframe(){
		SetupDrivers.driver.switchTo().frame("htmlComp-iframe");
	}

	public void writeTextbox() throws Exception{
		AutomationPracticeLocatorsObj.txtbxAutomation.sendKeys("Tesla");
		Thread.sleep(5000);
	}
}