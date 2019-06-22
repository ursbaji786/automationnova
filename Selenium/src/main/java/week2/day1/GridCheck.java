package week2.day1;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;





public class GridCheck {

	public static void main(String[] args) throws IOException {
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setPlatform(Platform.WIN8_1);
		dc.setBrowserName("chrome");
		//dc.setVersion("");
	
		RemoteWebDriver driver=null;
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		driver.get( "https://www.google.com/" );
		
		
		/*WebDriver augmentedDriver = new Augmenter().augment(driver);
		File src = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./snaps/grid.jpg"));*/
		System.out.println("completed");
		
		//driver.quit();		
	}

}
