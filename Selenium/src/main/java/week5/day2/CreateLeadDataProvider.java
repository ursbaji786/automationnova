package week5.day2;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonUtilis.BaseUtils;

public class CreateLeadDataProvider extends BaseUtils {
	
	@BeforeTest
	public void setData()
	{
		dataSheetName = "createLeadFile";
	}
	
	@Test(dataProvider ="FetchData")
	public  void createLeadTest(String cName, String fName, String lName) {
		
		// loginApp(); this one will call as @BeforeMethod
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
		// closeApp(); this one will call as @AfterMethod
	}
	
	
// below code mention in base utilis and declare variable	
	/*@DataProvider (name = "FetchData")
	public String[][] getData() throws IOException
	{
		
		ReadExcelIntegration excel = new ReadExcelIntegration();
		return excel.readExcel(dataSheetName);

		
		
	}*/
	
	
}
