package week5.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonUtilis.BaseUtils;

public class ParameterizationLearn extends BaseUtils {
	
	@Test (dataProvider ="FetchData")
	public  void createLeadTest(String cName, String fName, String lName) {
		
		// loginApp(); this one will call as @BeforeMethod
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
		// closeApp(); this one will call as @AfterMethod
	}
	
	
	
	@DataProvider (name = "FetchData")
	public String[][] getData()
	{
		String[][] data = new String[1][3];
		
		// 1st row data
		
		data[0][0] = "testleaf";
		data[0][1] = "baji";
		data[0][2] = "shaik";
		
		/*// 2nd row data 
		
		data[1][0] = "testleaf";
		data[1][1] = "jishu";
		data[1][2] = "sha";
		*/
		
		return data;		
		
		
		
	}
	
	@DataProvider (name = "fetch")
	public String[][] getData2 ()
	{
		String[][] data = new String[2][3];
		
		// 1st row data
		
		data[0][0] = "eqi";
		data[0][1] = "babu";
		data[0][2] = "shaik";
		
		// 2nd row data 
		
		data[1][0] = "eqi";
		data[1][1] = "jishu";
		data[1][2] = "sha";
		
		
		return data;		
		
		
		
	}
}
