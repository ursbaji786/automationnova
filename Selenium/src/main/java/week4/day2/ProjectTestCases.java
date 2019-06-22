package week4.day2;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectTestCases {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click on link
		driver.findElementByLinkText("Start your wonderful journey").click();
		Thread.sleep(2000);

		// search page
		String searchTitle = driver.getTitle();
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();

		//Tip: How to get tomorrow's date?

		// Get the current date

		Date date = new Date();

		//Get only the date (and not month, year, time etc)

		DateFormat sdf = new SimpleDateFormat("dd");

		// Get today's date

		String today = sdf.format(date);

		// Convert to integer and add 1 to it

		int tomorrow = Integer.parseInt(today)+1;

		// Print tomorrow's date

		System.out.println(tomorrow);



		// click on tomorrow date in zoomcar site

		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();

		// date confirmation

		String textDate = driver.findElementByXPath("//div[@class='days']/div[1]").getText();
		System.out.println(textDate);

		String dateString = String.valueOf(tomorrow);
		System.out.println(dateString);

		if(textDate.contains(dateString))
			System.out.println("Date verified");
		else
			System.out.println("date not verified");

		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(3000);

		// display results

		List<WebElement> resultsList = driver.findElementsByXPath("//div[@class='car-item']");

		System.out.println(resultsList.size());

		// take price

		List<WebElement> priceList = driver.findElementsByXPath("//div[@class='price']");


		List<Integer> intList = new ArrayList<>();


		for (WebElement price : priceList) {

			String priceText = price.getText();

			int parseInt = Integer.parseInt(priceText.replaceAll("\\D", ""));

			intList.add(parseInt);

		}
		System.out.println("price integer list"+intList);
		Integer maxPrice = Collections.max(intList);
		System.out.println("maxmum price is "+maxPrice);


		String carText = driver.findElementByXPath("//div[contains(text(),'"+maxPrice+"')]/preceding::h3[1]").getText();

		System.out.println("max car price name is "+carText);
		
		




	}

}
