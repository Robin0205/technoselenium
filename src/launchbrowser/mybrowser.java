package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mybrowser {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdrievr.chrome.driver","C:\\Users\\Robin\\eclipse-workspace\\technoselenium\\selenium-java-4.17.0");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
