package interview.questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandles {
	ChromeDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.findElementById("home").click();		
	}
	
	@Test
	public void moveToLastWindow1() {		
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		// Move the Set -> List
		List<String> allWindowHandles = new ArrayList<String>(allWindows);
		// Switch to the last window
		driver.switchTo().window(allWindowHandles.get(allWindowHandles.size()-1));
		// print the title to confirm the last window
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void moveToLastWindow2() {
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			String title = driver.getTitle();
			if(title.contains("Playground"))
				break;
		}
	}	
	
	@Test
	public void moveToLastWindow3() {
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> allWindowHandles = allWindows.iterator();
		boolean hasNext = allWindowHandles.hasNext();
		if(hasNext)
			driver.switchTo().window(allWindowHandles.next());
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	
	
	
	
	

}