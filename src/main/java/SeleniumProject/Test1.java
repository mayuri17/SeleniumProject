package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/File1.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//String title = driver.getTitle();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of hyperlinks are - " + links.size());
		
	      List<WebElement> menu = driver.findElements(By.tagName("li"));
	      System.out.println("The number of menu are - " + menu.size());
		
	      List<WebElement> menuItems = driver.findElements(By.tagName("span"));
	      System.out.println("The menu  - " + menuItems.toArray());
	      
	      driver.quit();

	}

}
