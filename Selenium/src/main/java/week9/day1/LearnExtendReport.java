package week9.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {
	
	ExtentReports ext;
	ExtentTest test;
	String testCaseName, testCaseDesc, author, category;
	
	// File level in @BeforeSuite
	
	public void startReport()
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporters/result.html");
		html.setAppendExisting(true);
		
		 ext = new ExtentReports();
		 ext.attachReporter(html);		
		
	}
	
	
	// Testcase level 
	
	
	public void report() {
		
		//ExtentTest test = ext.createTest(testCaseName, testCaseDesc);
		test = ext.createTest(testCaseName, testCaseDesc);
		test.assignAuthor(author);
		test.assignCategory(category);
		
		
		
	}
	
	// Step level
	
	public void testStepLevelReport(String status, String des) throws IOException
	{
	if(status.equalsIgnoreCase("PASS"))	{
		
		// Mediaentity builder to attach screenshot to our report.. where as build is to take all actions and make it one to perform
		// in Actions go and check .perform() then it will have build.perform();
		test.pass(des,
				
				MediaEntityBuilder.createScreenCaptureFromPath("./snaps.img.png").build()); 
		
	} else if (status.equalsIgnoreCase("FAIL")) {
		test.fail(des);
	}
		
		
		
		
		
	}
	
	
	
	// end report
	public void closeReport()
	{
	ext.flush();
	}

}
