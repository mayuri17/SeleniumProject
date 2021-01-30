package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. Firefox browser - geckodriver
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //this line will launch FF browser- Webdriver is interface, driver is a class
		
		//launch google.com on FF
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();*/
		
		//launch Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.close();
		
		//get title of this google.com page
		String title = driver.getTitle(); //returns a string internally
		System.out.println(title);
		
		//Validation Point- verify the title is correct or not- expected = actual
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		driver.quit(); //close/quit the browser
		


		

	}

}
