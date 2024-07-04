package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo1 {
	

@Test
public void launchbrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Robin\\eclipse-workspace\\technoselenium");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 
	
}
	

}
