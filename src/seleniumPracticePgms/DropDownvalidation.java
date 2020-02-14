package seleniumPracticePgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownvalidation {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="http://admin5.beta-wspbx.com/adminfive/signuppages/csdlogin.jsp";
		driver.get(url);
		driver.findElement(By.name("dealerinfo.dealername")).clear();
		driver.findElement(By.name("dealerinfo.dealername")).sendKeys("qa");
		driver.findElement(By.name("dealerinfo.dpassword")).clear();
		driver.findElement(By.name("dealerinfo.dpassword")).sendKeys("abc@1234");
		driver.findElement(By.id("CSDLoginAction_submit")).click();
		Select s=new Select(driver.findElement(By.name("provisioningobj.state_payment")));
		List<WebElement> options = s.getOptions();
		List actuallist=new ArrayList();
		for(int i=0;i<options.size();i++)
		{
			actuallist.add(options.get(i).getText());
			//System.out.println(options.get(i).getText());
		}
		//System.out.println(actuallist);
		List templist=new ArrayList();
		templist.addAll(actuallist);
		//Ascending order
		Collections.sort(templist);
		System.out.println(templist);
		 
		Assert.assertTrue(actuallist.equals(templist));
		List actuallist1=new ArrayList();
		Select s1=new Select(driver.findElement(By.name("provisioningobj.timezone")));
		List<WebElement> options1 = s1.getOptions();
		for(WebElement opt:options1)
		{
			String data=opt.getText();
			actuallist1.add(data);
		}
		List templist1=new ArrayList();
		templist1.addAll(actuallist1);
		Collections.sort(templist1);
		Assert.assertTrue(actuallist1.equals(templist1));
		
		driver.close();
	}
}
