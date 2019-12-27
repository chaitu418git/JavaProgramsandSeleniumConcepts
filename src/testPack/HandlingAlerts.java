package testPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		String driverexepath="E:\\New Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverexepath);
		//to open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(url);
		//Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='proceed']")));
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert al = driver.switchTo().alert();
		String alertText = al.getText();
		System.out.println(alertText);
		al.accept();
		System.out.println("clicked on ok");
		driver.close();
}
}