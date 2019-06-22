package week5.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonUtilis.BaseUtils;

public class CreateLead extends BaseUtils{

	@Test ()
	public  void createLeadTest() {
		
		// loginApp();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("My Company Name");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kalaiselvi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sonai");
		driver.findElementByName("submitButton").click();
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		driver.findElementByLinkText("Edit").click();
		//Drop Down
		WebElement industry = driver.findElementById("updateLeadForm_industryEnumId");
		Select dd1=new Select(industry);
		dd1.selectByVisibleText("Computer Software");//Select by visible text
		WebElement ownership = driver.findElementById("updateLeadForm_ownershipEnumId");
		Select dd2=new Select(ownership);
		List<WebElement> dropDown = dd2.getOptions();
		dd2.selectByIndex(dropDown.size()-1);//Select by index
		WebElement submitButton = driver.findElementByClassName("smallSubmit");
		WebElement currency = driver.findElementById("updateLeadForm_currencyUomId");
		Select dd3=new Select(currency);
		dd3.selectByValue("INR");//select by value
		submitButton.click();
	//WebElement userName=driver.findElementById("username",Keys.TAB);
		//Thread.sleep(3000);
		
		// closeApp();
	}


}


