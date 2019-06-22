package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractise {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		
	// instead of above 2 lines we can write as below line also
	// driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		// window handle
		
		Set<String> setWindowHandles = driver.getWindowHandles();
		
		List<String> listWindowHandles = new ArrayList<>();
		listWindowHandles.addAll(setWindowHandles);		
		
		driver.switchTo().window(listWindowHandles.get(1));
		System.out.println("moved to 1st window ****");
		// perform actions in 1st window
		
		driver.findElementByName("id").sendKeys("10365");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		// switch back to primary window
		
		driver.switchTo().window(listWindowHandles.get(0));
		System.out.println("moved to primary window ****");
		
		// perform some actions in primary window
		
		driver.findElementByLinkText("Merge").click();
		
		
		// accept alert
		
		Alert myAlert = driver.switchTo().alert();
		String alertText = myAlert.getText();
		System.out.println("Alert text is "+alertText);
		myAlert.accept();
		
		//taking screenshot of error messgae
		
		File sourceSnap = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/errormsg1.png");
		FileUtils.copyFile(sourceSnap, dest);
		
		// getting text and compare
		
		String errorText = driver.findElementByXPath("//li[@class='errorMessage']").getText();
		
		if (errorText.contains("required parameter is missing"))
			System.out.println("error message text verified");
		else
			System.out.println("not verified error message");
		
		// no records display verify
		
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		
		driver.findElementByName("id").sendKeys("100365");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String noRecords = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(noRecords.contains("No records"))
			System.out.println("No records text verified");
		else
			System.out.println("not verified No records message");
			
		driver.close();
		
		
	}

}
