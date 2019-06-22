package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataCapture {

	public static void main(String[] args) throws InterruptedException {

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

		// print header in web table

		List<WebElement> headerNames = driver.findElementsByXPath("//div[@class='x-grid3-header-offset']");

		for(WebElement element:headerNames)
			System.out.println("Header details are " + element.getText());

		//print all data in web table

		List<WebElement> allDataInTable = driver.findElementsByXPath("//div[@class='x-panel x-grid-panel']");
		
		for(WebElement element:allDataInTable)
			System.out.println("printing all data **** " + element.getText());

	}

}
