package commonUtilis;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.ReadExcelIntegration;

public class BaseUtils {

	public ChromeDriver driver;
	public String dataSheetName;
	
	

/*	@BeforeMethod
	public void loginApp() {	


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement userName=driver.findElementById("username");
		userName.sendKeys("demosalesmanager");
		WebElement passWord= driver.findElementById("password");
		passWord.sendKeys("crmsfa");		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}*/
	
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void loginAppParameters(String siteUrl, String uName, String pwd) {	


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(siteUrl);
		WebElement userName=driver.findElementById("username");
		userName.sendKeys(uName);
		WebElement passWord= driver.findElementById("password");
		passWord.sendKeys(pwd);		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}


	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}


	@DataProvider (name = "FetchData")
	public String[][] getData() throws IOException
	{
		ReadExcelIntegration excel = new ReadExcelIntegration();
		return excel.readExcel(dataSheetName);
	
		
	}
	
	
	

}
