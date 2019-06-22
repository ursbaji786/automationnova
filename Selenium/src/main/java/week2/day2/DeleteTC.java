package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteTC {

	public static void main(String[] args) throws InterruptedException {
		
		String outputText = "No records to display";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		// login
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		//leads
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("Test121@gmail.com");
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		Thread.sleep(5000);
		
		// first lead
		
		WebElement firstLeadId = driver.findElementByXPath("(//a[@class='linktext'])[4]");
		String leadId = firstLeadId.getText();
		firstLeadId.click();
		System.out.println("Lead id is "+leadId);
		
					
		// click delete
		
		driver.findElementByLinkText("Delete").click();
		
		// search with deleted lead id
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		Thread.sleep(5000);
		
		// verify no records
		WebElement displayText = driver.findElementByXPath("(//div[@class='x-paging-info'])[1]");
		String text = displayText.getText();
		System.out.println(text);
		
		if(text.equals(outputText))
		{
			System.out.println("NO records displayed");
		}
		else
		{
			System.out.println("some thing goes wrong");
		}
		
		driver.close();
		
		
		
	
		
		
		
	}

}
