package uiPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		

		// Step 2- Enter username and password
		driver.get("http://s3.amazonaws.com/co.tulip.cdn/memtracking/index.html");
		driver.findElement(By.id("filterPageHome")).click();
		
		driver.findElement(By.id("filterPageEditor")).click();
		
		
		while(true) {
			if(driver.findElement(By.id("statTotalReadings")) != null) {
				System.out.println("Stats Element Found");
				break;
			}
		}
		
		
		
	
		
		
		
		
		
		

	}

}
