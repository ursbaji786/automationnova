package basics.grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	
	
	ChromeDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

}
