package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProjectTCFacebook {
	
	static String str="Like";
	String str1="Liked";

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("shaik.rabbit@gmail.com");
		driver.findElementById("pass").sendKeys("Rabbit*123");
		driver.findElementByXPath("//input[@value='Log In']").click();
		Thread.sleep(5000);
		driver.findElementByName("q").sendKeys("TestLeaf");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@type='submit']/i").click();		
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Places'])[1]").click();
		System.out.println("clicked on places");
		Thread.sleep(5000);
		
		
		String afterSearchtext = driver.findElementByLinkText("TestLeaf").getText();
		System.out.println("text of link "+afterSearchtext);
		driver.findElementByLinkText("TestLeaf").click();
		
String textLikeButton = driver.findElementByXPath("//button[contains(@class,'likeButton')]/i").getText(); // check this once
		
		System.out.println(textLikeButton);
		
		if (textLikeButton.equalsIgnoreCase(str))
		{
			driver.findElementByXPath("//button[contains(@class,'likeButton')]").click();
		}
		else
		{
			System.out.println("after checking button text "+textLikeButton);
		}
		Thread.sleep(3000);
		String textLikeCount = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
		System.out.println(textLikeCount);
			
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
