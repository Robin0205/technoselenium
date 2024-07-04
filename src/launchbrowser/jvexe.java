package launchbrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jvexe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Robin\\eclipse-workspace\\technoselenium");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor jsex = (JavascriptExecutor) driver;
		WebElement ele = (WebElement) jsex.executeScript("return document.getElementById('email')");
        ele.sendKeys("ramesh");
        Thread.sleep(5000);
        driver.close();
	}

}
