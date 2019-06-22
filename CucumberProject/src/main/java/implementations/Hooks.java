package implementations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Hooks {
	
	public ChromeDriver driver;
	
	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
	}
	
	
	@After
	public void afterScenario(Scenario sc1)
	{
		System.out.println(sc1.getStatus());
	}
	
	@Given("Open your Browser")
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	@And("Maximize Browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	
	@And("Set Timeout")
	public void setTimeout() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("Load the URL")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	

}
