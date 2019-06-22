package week2.day1;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		
/*	// setting of firfox driver
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe");
		
		FirefoxDriver driver1 = new FirefoxDriver();
		
		driver1.get("http://leaftaps.com/opentaps/");*/
		
	
		
		// setting of Chrome driver 		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// create object for ChromeDriver class
		
		 ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		
	// instead of above 2 lines we can write as below line also
	// driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("EQI");
		driver.findElementById("createLeadForm_firstName").sendKeys("Baji");
		driver.findElementById("createLeadForm_lastName").sendKeys("Shaik");
		driver.findElementByName("submitButton").click();
		
		String leadtitle = driver.getTitle();
		System.out.println(leadtitle);
		
		// select dropdown using selectByVisibleText
		driver.findElementByLinkText("Edit").click();
		WebElement dd1 = driver.findElementById("updateLeadForm_industryEnumId");
		Select firstdd = new Select(dd1);
		firstdd.selectByVisibleText("Computer Software");
		
		//select last value from dropdown
		
		WebElement dd2 = driver.findElementById("updateLeadForm_ownershipEnumId");
		Select seconddd = new Select(dd2);
		List<WebElement> options = seconddd.getOptions();
		System.out.println(options.size());
		seconddd.selectByIndex(options.size()-1);
		
		
		
		// to close browser
		//driver.close();
		
		
		
		
		
		
	}

}
