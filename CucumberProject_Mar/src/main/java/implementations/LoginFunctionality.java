package implementations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFunctionality {
	
	public ChromeDriver driver;
	
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
	
	@And("Enter Username as (.*)")
	public void enterUserName(String uName)
	{
		driver.findElementById("username").sendKeys(uName);
	}
	@And("Enter Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		
	}
	@When("Click Login Button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	@Then("Verify Login successful")
	public void verify() {
		System.out.println("login success");
		
	}
	
	@But("Verify Login failed")
	public void verifyFail() {
		System.out.println("login failed");
		
	}
	
	

}
