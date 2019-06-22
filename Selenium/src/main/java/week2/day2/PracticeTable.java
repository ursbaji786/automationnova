package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		//Get the count of number of columns
		Thread.sleep(3000);
		
		 List<WebElement> columns = driver.findElementsByXPath("//table[@cellspacing='0']//th");
		System.out.println("number of columns in table is "+columns.size());
		
		//Get the count of number of rows
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@cellspacing='0']//tr[2]/td");
		System.out.println("number of rows in table is "+rows.size());
		
		// find percentage
		WebElement percentage = driver.findElementByXPath("//font[contains(text(),'Learn to interact')]/following::font");
		System.out.println(percentage.getText());
		
		// lowest %
		
		List<WebElement> findPercentage = driver.findElementsByXPath("//font[contains(text(),'%')]");
		
		System.out.println(findPercentage);
		
		/*for (int i = 1; i < findPercentage.size(); i++) {
			
									
		}*/
		
		
		
		
		
		





	}
}