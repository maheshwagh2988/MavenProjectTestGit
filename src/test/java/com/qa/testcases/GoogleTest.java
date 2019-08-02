package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver_win32_75/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("@BeforeMethod = It Set Properties and Launch Google URL");
	}
	@Test (priority=1,groups="Title")
	public void GoogleTitleTest(){
		String title= driver.getTitle();
		System.out.println("Page Title is : "+title);
	}
	@Test (priority=2,groups="All Logoes")
	public void GoogleLogo(){
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Is Google Logo display? True= Yes and False=No := " +logo);
	}
	@Test (priority=3,groups="All Link")
	public void GmailLinkText(){
		boolean linkText=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Is Google Gmail display? True= Yes and False=No := " +linkText);
	}
	@Test (priority=4,groups="All TestCases")
	public void TestCase1(){
		
		System.out.println("Test Case 1");
	}
	@Test (priority=5,groups="All TestCases")
	public void TestCase2(){
		
		System.out.println("Test Case 2");
	}
	@Test (priority=6,groups="All TestCases")
	public void TestCase3(){
		
		System.out.println("Test Case 3");
	}
	@AfterMethod
	public void tearDown(){
		System.out.println("@AfterMethod = It Close URL and quit browser");
		driver.quit();
	}

}
