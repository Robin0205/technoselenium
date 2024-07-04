package launchbrowser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public  class absclass  {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Robin\\eclipse-workspace\\technoselenium");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		File Src=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src,new File("C:\\Users\\Robin\\Desktop\\screenshot\\google.png"));
		Thread.sleep(3000);

		List<WebElement> alllinks=driver.findElements(By.tagName("a"));

		for(int i=1;i<alllinks.size();i++)

		{
			alllinks.get(i).click();
			Thread.sleep(2000);
			File Src1=driver.getScreenshotAs(OutputType.FILE);
			Files.copy(Src1,new File("C:\\Users\\Robin\\Desktop\\screenshot\\img.png"));
			driver.navigate().back();
			Thread.sleep(3000);

		}
		
		driver.close();
		
	}		

}
