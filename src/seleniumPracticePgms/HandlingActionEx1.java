package seleniumPracticePgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActionEx1 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://demoqa.com/slider/";
		driver.get(url);
		WebElement silderElement=driver.findElement(By.xpath("//div[@id='slider']"));
		Actions action=new Actions(driver);
		action.moveToElement(silderElement, 50,0).click().build().perform();
		Thread.sleep(3000);
		driver.close();
		
	}
}
