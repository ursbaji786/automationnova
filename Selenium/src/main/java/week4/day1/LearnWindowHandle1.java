package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		

		//getting window unique id	
			String window = driver.getWindowHandle();
			System.out.println(window);
		
		driver.findElementByLinkText("Contact Us").click();
		
			
		// getting all windows
		
		Set<String> allSetWindows = driver.getWindowHandles();
		
		// moving set to list so that we can get using index
		
		List<String> allListWindows = new ArrayList<>();
		
		allListWindows.addAll(allSetWindows);
		
		// switching to second window
		
		driver.switchTo().window(allListWindows.get(1));
		String secondTitle = driver.getTitle();
		System.out.println("second window title is "+secondTitle);
		
		// switching back to previous window and close
		
		
		driver.switchTo().window(allListWindows.get(0));
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
