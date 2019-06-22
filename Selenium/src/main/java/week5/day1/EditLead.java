package week5.day1;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonUtilis.BaseUtils;

public class EditLead extends BaseUtils{
	//@Test (dependsOnMethods = {"week5.day1.CreateLead.createLeadTest"})
	@Test
	public void editLeadTest() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("@gmail.com");
		//driver.findElementByName("emailAddress").clear();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		// Thread.sleep(6000);
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		
		// instead of Thread.sleep will have webdriver wait (but need to have sleep of 0.5 sec to interact webdriver wait
		
		Thread.sleep(500);	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))).click();
		
		
		System.out.println("The Page title is- "+ driver.getTitle());
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementByXPath("//input[@value='Update']").click();
		String attribute = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Comapny Name "+attribute);
		if(attribute.contains("TestLeaf"))
			System.out.println("Company name Updated");
		else
			System.out.println("Company name not updated");
	}

}
