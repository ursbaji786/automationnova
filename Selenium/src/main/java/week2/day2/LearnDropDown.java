package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		System.out.println(driver.findElementByXPath("(//div[@class='example']/following::input)[1]").isSelected());
		
		System.out.println(driver.findElementByXPath("(//div[@class='example']/following::input)[3]").isSelected());
		
		driver.findElementByXPath("(//div[@class='example']/following::input)[1]").click();
		driver.findElementByXPath("(//div[@class='example']/following::input)[3]").click();
		
		
	}

}
