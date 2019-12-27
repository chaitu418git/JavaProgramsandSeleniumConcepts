package seleniumPracticePgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class HandlingKeys {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://www.google.com/";
		driver.get(url);
		WebElement googleSearch=driver.findElement(By.xpath("//input[@name='q']"));
		Actions action=new Actions(driver);
		action.keyDown(googleSearch, Keys.SHIFT)
		.sendKeys(googleSearch,"hello")
		.keyUp(googleSearch, Keys.SHIFT)
		.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(7000);
		driver.close();
		
		
	}
}
