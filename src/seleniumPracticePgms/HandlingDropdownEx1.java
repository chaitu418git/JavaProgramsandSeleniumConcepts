package seleniumPracticePgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropdownEx1 {
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	String url="https://www.toolsqa.com/automation-practice-form/";
	driver.get(url);
	Select select=new Select(driver.findElement(By.xpath("//select[@id='continents']")));
	select.selectByValue("EU");
	System.out.println("selected europe");
	Thread.sleep(3000);
	//select.deselectByValue("EU");
	//Thread.sleep(3000);
	//iterate all the values 
	int allOptions=select.getOptions().size();
	System.out.println(allOptions);
	for(int i=0;i<allOptions;i++)
	{
		if(select.getOptions().get(i).getText().equals("Australia"))
		{
			select.selectByIndex(i);
			Thread.sleep(6000);
			System.out.println(i);
			System.out.println("Selected");
			break;
		}
		
		
	}
	//System.out.println(i);
	driver.close();
}
}
