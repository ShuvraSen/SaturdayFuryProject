package upskill.runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resource/FeatureFiles" }, 
				glue = { "upskill.ebay.stepDef", "upskill.utilities" }, 
				tags = {"@regression"}, 
				plugin = { "pretty", "html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports.html" }, 
				monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/config.xml"));
	}

}

/*Key Points about Tags for cucumber Runner Class:
Single Tag:

tags = "@SmokeTest": Runs scenarios or features tagged with @SmokeTest.
Multiple Tags (AND condition):

tags = "@SmokeTest and @Regression": Runs scenarios tagged with both @SmokeTest and @Regression.
Multiple Tags (OR condition):

tags = "@SmokeTest or @Regression": Runs scenarios tagged with either @SmokeTest or @Regression.
Excluding Tags:

tags = "not @Slow": Excludes scenarios tagged with @Slow.
Complex Tag Expressions:

tags = "@SmokeTest and not @Slow": Runs scenarios tagged with @SmokeTest but excludes those tagged with @Slow.
 * 
 * 
 */

