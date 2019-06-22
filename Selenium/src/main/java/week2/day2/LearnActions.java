package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		System.out.println(drag.getLocation());
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 75, 50).perform();
		
	/*	WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		
	builder.dragAndDrop(drag, drop).perform();*/
		
		
		
		
	}

}
