package seleniumPracticePgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String url="https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);	
		//getting rows count
		int rowsCount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println("rows count"+rowsCount);
        //getting column count
        int colsCount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println("column count"+colsCount);
      //table[@id='customers']/tbody/tr[2]/td[1]
        String beforeXpath="//table[@id='customers']/tbody/tr[";
        String afterXpath="]/td[";
        String finalXpath="]";
        
        //printing all rows cell data
        for(int i=2;i<=rowsCount;i++)
        {
        	for(int j=1;j<=colsCount;j++)
        	{
        		String fXpath=beforeXpath+i+afterXpath+j+finalXpath;
        			WebElement allCellsData = driver.findElement(By.xpath(fXpath));
        			System.out.println(allCellsData.getText());
        	}
        }
        
        System.out.println();
        //printing only 2nd row data:
      //table[@id='customers']/tbody/tr[2]/td[2]
        String bXpath="//table[@id='customers']/tbody/tr[";
        String aXpath="]/td[2]";
        for(int i=2;i<=rowsCount;i++)
        {
        	String ffXpath=bXpath+i+aXpath;
        	WebElement secondRowCellData=driver.findElement(By.xpath(ffXpath));
        	System.out.println(secondRowCellData.getText());
        }
	driver.close();
	}
}
