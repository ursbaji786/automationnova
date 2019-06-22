package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookNotifications {
	
	public static void main(String[] args) {

	// To disable notifications in chrome for facebook, use the below code:
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(op);
	
	//ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	

	}	
	
}
