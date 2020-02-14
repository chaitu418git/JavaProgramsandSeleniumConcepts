package seleniumPracticePgms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin5ReportUserCDR {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://admin.unifiedcloudit.com/";
		driver.get(url);
		//WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.findElement(By.id("xusername")).sendKeys("accountvalidation");
		driver.findElement(By.id("password")).sendKeys("abc@1234");
		driver.findElement(By.className("normalButton")).click();
		if(driver.findElement(By.xpath("//img[@class='imageheight']")).isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Report Manager')]"));
		WebDriverWait wait1=new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(element));
		action.moveToElement(element).click().build().perform();
		wait1.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		String parentwindow= itr.next();
		String childwindow= itr.next();
		System.out.println("Parent Window: "+parentwindow+" Child winodw: "+childwindow);
		driver.switchTo().window(childwindow);
		WebElement loadingid=driver.findElement(By.id("loadingMessage_div"));
		wait1.until(ExpectedConditions.attributeToBe(loadingid, "style", "display: none;"));
		WebElement userelement=driver.findElement(By.xpath("//ul[@class='nav nav-tabs']//a[@id='ptctabid_2']"));
		WebElement userCdr=driver.findElement(By.xpath("//div[@id='maincontent_layout']//li[2]//ul[1]//li[1]//a[1]"));
		action.moveToElement(userelement).moveToElement(userCdr).click().build().perform();
		
		//WebElement loadingid1=driver.findElement(By.id("loadingMessage_div"));
		wait1.until(ExpectedConditions.attributeToBe(loadingid, "style", "display: none;"));
		System.out.println("user cdr clicked");
		System.out.println(userCdr.isDisplayed());
		
          		
		
		
	}
}
