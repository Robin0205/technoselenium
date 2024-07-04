package launchbrowser;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import com.google.common.io.Files;

public class launchbrowser {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chromer.driver","C:\\Users\\Robin\\eclipse-workspace\\technoselenium");
		ChromiumDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Random ran=new Random();
		
		File Src=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src,new File("C:\\Users\\Robin\\Desktop\\screenshot\\ran.nextInt(10).png"));
		
		Thread.sleep(3000);

		driver.close();



	}

}
