package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * @BeforeSuite -- Setup System properties  1
 * @BeforeTest--launch browser 				2
 * @BeforeClass--- Login to App 			3
 * 
 * 
 * @BeforeMethod--Enter the URL 	4		-- * @BeforeMethod will execute before each and every @Test			
 * @Test-- Check Google page title	5		
 * @AfterMethod--Log out from app   6		-- * @AfterMethod will execute After each and every @Test				

 * 
 * @BeforeMethod--Enter the URL    	4		 -- * @BeforeMethod will execute before each and every @Test	
 * @Test--SearchPage				5
 * @AfterMethod--Log out from app	6		-- * @AfterMethod will execute After each and every @Test
 * 
 * 
 * 
 * 
 * @AfterTest--close browser
 * @AfterClass
 * @AfterSuite --GenrateTestReport

 * */
public class TestNgBasic {
	
	
	@BeforeSuite //1
	public void  Setup(){
		System.out.println("@BeforeSuite -- Setup System propertes ");
	}
	@BeforeTest //2
	public void launchbrowser(){
		System.out.println("@BeforeTest--launchbrowser ");
	}
	@BeforeClass //3
	public void Login(){
		System.out.println("@BeforeClass--- Login to App ");
	}
	@BeforeMethod //4	
	public void enterurl(){
		System.out.println("@BeforeMethod--Enter the URL ");
		
	}
	@Test  //5
	public void GooglepagetitlepageTestCase_1(){
		System.out.println("@Test-- Check Google page");
	}
	@Test  //5
	public void SearchPageTestCase_2(){
		System.out.println("@Test-- Check Search");
	}
	
	@AfterMethod //6
	public void logoutApp(){
		System.out.println("@AfterMethod--Log out from app");
	}
	@org.testng.annotations.AfterClass //7
	public void deleteAllCookes(){
		System.out.println("@AfterClass--deleteAllCookes");
	}
	@AfterTest //8
	public void closebrowser(){
		System.out.println("@AfterTest--closebrowser");
	}
	@AfterSuite  //9
	public void GenrateTestReport(){
		System.out.println("@AfterSuite --GenrateTestReport");
	}

}
