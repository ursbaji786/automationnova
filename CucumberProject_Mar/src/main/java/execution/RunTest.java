package execution;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = "src/main/java/features/Login2.feature",glue = "implementations",

		monochrome=true) /*dryRun=true, snippets=SnippetType.CAMELCASE)*/


public class RunTest extends AbstractTestNGCucumberTests {

}
