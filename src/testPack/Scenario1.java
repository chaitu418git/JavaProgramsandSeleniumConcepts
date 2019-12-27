package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static void main(String[] args) {
String driverexepath="E:\\New Selenium\\chromedriver_win32\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", driverexepath);
//to open chrome browser
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
String url="http://www.shop.demoqa.com";
driver.get(url);

System.out.println("title of th web page"+driver.getTitle());
int len=driver.getTitle().length();
System.out.println("length of page title:" +len);

String actualUrl=driver.getCurrentUrl();
if (actualUrl.equals(url))
{
System.out.println("url opens correctly");	
}
else {
	 System.out.println("Verification Failed - An incorrect Url is opened.");
}
System.out.println("Actual url of webpage"+driver.getCurrentUrl());
System.out.println("Expected url of web page:" +url);
//System.out.println("printing page "+driver.getPageSource());
int pageSourcelen=driver.getPageSource().length();
System.out.println("printing page source length"+pageSourcelen);
driver.close();

}
}