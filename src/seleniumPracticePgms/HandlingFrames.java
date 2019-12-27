package seleniumPracticePgms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://www.toolsqa.com/iframe-practice-page/";
		driver.get(url);
		List<WebElement> totalIframes = driver.findElements(By.tagName("iframe"));
		System.out.println(totalIframes.size());
//		driver.switchTo().frame("IF1");
//		System.out.println("in first frame");
		
	//	driver.switchTo().frame("iframe1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe1']")));
		System.out.println("in first frame");
		driver.switchTo().defaultContent();
		System.out.println("default content");
		driver.close();
	}
}
