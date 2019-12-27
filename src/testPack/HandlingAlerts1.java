package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts1 {
	public static void main(String[] args) throws InterruptedException {
		String driverexepath="E:\\New Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverexepath);
		//to open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://html.com/input-type-file/";
		driver.get(url);
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Chaitanya\\Desktop\\Daily Data.txt");
		
		
}
}