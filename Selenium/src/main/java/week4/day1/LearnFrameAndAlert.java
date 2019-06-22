package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameAndAlert {

	public static void main(String[] args) {

		String name = "bajishaik";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// going to frame
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		// handle alert
		
		Alert myAlert = driver.switchTo().alert();   // Alert is interface and we returning type is Alert
		
		myAlert.getText();
		System.out.println(myAlert.getText());
		
		myAlert.sendKeys(name);
		
		myAlert.accept();
		
		// comparing text
		
		String text = driver.findElementById("demo").getText();
		
		if (text.contains(name))
			System.out.println("name present in the text");
		else
			System.out.println("name not present");
		
		
	}

}
