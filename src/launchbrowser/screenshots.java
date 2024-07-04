package launchbrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Robin\\eclipse-workspace\\technoselenium");
		ChromeDriver driver=new ChromeDriver();

		//screenshot of Google front page
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		File Src=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src,new File("C:\\Users\\Robin\\Desktop\\screenshot\\google.png"));
		Thread.sleep(3000);
		//click on hindi link and takescreenshot of hindi google front page

		WebElement hindilink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]"));
		hindilink.click();
		Thread.sleep(2000);
		File Src1=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src1,new File("C:\\Users\\Robin\\Desktop\\screenshot\\hindi.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		//click on bangla link and takescreenshot of bangla google front page

		WebElement banglalink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[2]"));
		banglalink.click();
		Thread.sleep(2000);
		File Src2=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src2,new File("C:\\Users\\Robin\\Desktop\\screenshot\\bangla.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		//click on telugu link and takescreenshot of telugu google front page

		WebElement telugulink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[3]"));
		telugulink.click();
		Thread.sleep(2000);
		File Src3=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src3,new File("C:\\Users\\Robin\\Desktop\\screenshot\\telugu.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		//click on marati link and takescreenshot of marati google front page

		WebElement marathilink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[4]"));
		marathilink.click();
		Thread.sleep(2000);
		File Src4=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src4,new File("C:\\Users\\Robin\\Desktop\\screenshot\\marathi.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		//click on tamil link and takescreenshot of tamil google front page

		WebElement tamillink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));
		tamillink.click();
		Thread.sleep(2000);
		File Src5=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src5,new File("C:\\Users\\Robin\\Desktop\\screenshot\\tamil.png"));
		driver.navigate().back();
		Thread.sleep(3000);
     
		//click on gujrathi link and takescreenshot of gujrathi google front page

		WebElement gujarathilink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[6]"));
		gujarathilink.click();
		Thread.sleep(2000);
		File Src6=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src6,new File("C:\\Users\\Robin\\Desktop\\screenshot\\gujarathi.png"));
		driver.navigate().back();
		Thread.sleep(3000);


		//click on kanada link and takescreenshot of kanada google front page

		WebElement kanadalink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[7]"));
		kanadalink.click();
		Thread.sleep(2000);
		File Src7=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src7,new File("C:\\Users\\Robin\\Desktop\\screenshot\\kanada.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		//click on malayalam link and takescreenshot of malayalam google front page

		WebElement malayalamlink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[8]"));
		malayalamlink.click();
		Thread.sleep(2000);
		File Src8=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src8,new File("C:\\Users\\Robin\\Desktop\\screenshot\\malayalam.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		//click on punjabi link and takescreenshot of punjabi google front page

		WebElement punjabilink=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[9]"));
		punjabilink.click();
		Thread.sleep(2000);
		File Src9=driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Src9,new File("C:\\Users\\Robin\\Desktop\\screenshot\\punjabi.png"));
		driver.navigate().back();
		Thread.sleep(3000);

		driver.close();
	}

}
