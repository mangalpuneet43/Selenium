package PracticeQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumException {

	public static void main(String[] args) {
	
		try
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A1194881\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	//	driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));
		driver.findElement(By.name("btnK")).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
		}
		
		
	}

}
