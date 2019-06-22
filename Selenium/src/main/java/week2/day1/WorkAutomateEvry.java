package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkAutomateEvry {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("ursbaji@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("test",Keys.TAB);
	/*	System.out.println(driver.findElementByXPath("//input[@value='TestLeaf']").getText());
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		System.out.println(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")
				.isEnabled());*/
		
		
		
		
	}

}
