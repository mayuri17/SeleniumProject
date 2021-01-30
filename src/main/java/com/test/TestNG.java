package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	// every annotation should be associated with a method
	// every TestNG class is divided in 3 parts pre conditions, test cases, post
	// conditions

	// pre-conditions before test cases
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup");
	}

	@BeforeTest
	public void login() {
		System.out.println("Launch browser ");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Login");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}

	// Test cases
	// Test case no 1
	@Test(priority = 1, invocationCount = 10) // no of times you wanna execute this particular TC
	public void googleTestTitle() {
		System.out.println("TC Google");
	}

	// Test case to test or find infinite loop, give timeout=30sec, if not executed
	// within this time the TC is terminated
	@Test(invocationTimeOut = 2)
	public void caseTest() {

	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void caseTest2() {
		// we are expecting number format
		// exception so do not fail this TC
	}
	
	//how to validate? Using assertions, keyword Assert is used
	
	public void googleTestTitle1() {
		String title = driver.getTitle();
		System.out.println("TC Google");
		
		Assert.assertEquals(title, "Google", "Title not matched"); //if fails- gives assertion error
	}

	// post conditions after test case
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete cookies");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate reports");
	}
}
