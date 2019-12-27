package seleniumPracticePgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingActions {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://demoqa.com/menu/";
		driver.get(url);
       WebElement musicElement = driver.findElement(By.xpath("//div[@class='demo-frame']/ul/li[6]"));
       WebElement rockElement = driver.findElement(By.xpath("//div[@id='ui-id-10']"));
       WebElement alternateElement=driver.findElement(By.xpath("//div[@id='ui-id-11']"));
       
        Actions action=new Actions(driver);
        action.moveToElement(musicElement).perform();
       // Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(rockElement));
        action.moveToElement(rockElement).perform();
        //Thread.sleep(3000);;
        wait.until(ExpectedConditions.visibilityOf(alternateElement));
        
        action.moveToElement(alternateElement).click().build().perform();
     
        Thread.sleep(3000);
        driver.close();
        
	}
}
