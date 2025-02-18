package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.AutomationPracticeActions;

public class AutomationPracticeSteps {
	AutomationPracticeActions AutomationPracticeActionsobj=new AutomationPracticeActions();
	@Given("^Open UpSkill Automation Practice page$")
	public void open_UpSkill_Automation_Practice_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeActionsobj.loadAutomationPage();
	}

	@When("^Switch to Practice iFrame$")
	public void switch_to_Practice_iFrame() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeActionsobj.switchIframe();
	}

	@Then("^User should able to write on Textbox$")
	public void user_should_able_to_write_on_Textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeActionsobj.writeTextbox();
	}

}
