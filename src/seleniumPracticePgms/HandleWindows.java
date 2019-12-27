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

public class HandleWindows {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.get(url);
		WebDriverWait wait=new WebDriverWait(driver, 60);
		System.out.println("--"+driver.findElement(By.xpath("//div[@id='page']/..")).getAttribute("style"));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("button1")));
		 driver.findElement(By.id("button1")).click();
		//Actions action=new Actions(driver);
		//action.moveToElement(newWindow).click().build().perform();
		
		Set<String> allHandles = driver.getWindowHandles();
		Iterator<String> itr = allHandles.iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		driver.switchTo().window(childWindow);
		System.out.println("switched to child window");
		WebElement searchText = driver.findElement(By.xpath("//span[contains(text(),'Automation Tools Tutorial')]"));
		if(searchText.getText().equalsIgnoreCase("Automation Tools Tutorial"))
		{
			System.out.println("text verified in child window");
		}
//back to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("in parent window");
		driver.close();
	}
}
