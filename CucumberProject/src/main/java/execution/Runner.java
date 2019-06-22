package execution;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = "src/main/java/features/LoginDataDriven.feature",glue = "implementations",

		monochrome=true) /*dryRun=true, snippets=SnippetType.CAMELCASE)*/


public class Runner extends AbstractTestNGCucumberTests {

}
