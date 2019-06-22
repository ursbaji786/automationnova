package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkIrctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("qwerty129");
		driver.findElementByLinkText("Check Availability").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("Shaik7865");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Shaik7865");
		// dropdown for security question
		WebElement firstDropDown = driver.findElementById("userRegistrationForm:securityQ");
		
		Select dd1 = new Select(firstDropDown);
		dd1.selectByVisibleText("Who was your Childhood hero?");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Chiru");
		
		// enter personal details
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Shaik");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		// DOB dropdown
		WebElement dayDropDown = driver.findElementById("userRegistrationForm:dobDay");
		Select dayDD = new Select(dayDropDown);
		dayDD.selectByIndex(5);
		//month dropdown
		
		WebElement monthDropDown = driver.findElementById("userRegistrationForm:dobMonth");
		Select monthDD = new Select(monthDropDown);
		monthDD.selectByVisibleText("JUN");
		
		// year dropdown
		
		WebElement yearDropDown = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yearDD = new Select(yearDropDown);
		yearDD.selectByVisibleText("1988");
		
		// occupation dropdown
		
		WebElement occupDropDown = driver.findElementById("userRegistrationForm:occupation");
		Select occupDD = new Select(occupDropDown);
		occupDD.selectByVisibleText("Professional");
		
		// aadhar info
		driver.findElementById("userRegistrationForm:uidno").sendKeys("792093254857");
		
		// country dropdown
		
		WebElement countryDropDown = driver.findElementById("userRegistrationForm:countries");
		
		Select countryDD = new Select(countryDropDown);
		countryDD.selectByVisibleText("India");
		
		// enter email, mobile
		
		driver.findElementById("userRegistrationForm:email").sendKeys("shaik.rabbit@gmail.com");
		
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9092087689");
		
		// nationality dropdown
		WebElement nationDropDown = driver.findElementById("userRegistrationForm:nationalityId");
		Select nationDD = new Select(nationDropDown);
		nationDD.selectByVisibleText("India");
		
		// address details
		
		driver.findElementById("userRegistrationForm:address").sendKeys("NO 15, block A, Sri Ganesh flats");
		driver.findElementById("userRegistrationForm:area").sendKeys("Pallikaranai");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100",Keys.TAB);
		
		Thread.sleep(5000);
		
		WebElement cityDropDown = driver.findElementById("userRegistrationForm:cityName");
		Select cityDD = new Select(cityDropDown);
		cityDD.selectByVisibleText("Kanchipuram");
		
		Thread.sleep(1000);
		
		//po dropdown
		
		WebElement postOfficeDropDown = driver.findElementById("userRegistrationForm:postofficeName");	
		System.out.println("at PO");
	    Select poDD = new Select(postOfficeDropDown);
	
	poDD.selectByValue("Medavakkam  S.O");
	
		/*List<WebElement> options = poDD.getOptions();
		System.out.println(options.size());
		poDD.selectByIndex(options.size()-1);*/
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("0449092087");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
