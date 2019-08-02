package com.qa.testcases;

import org.testng.annotations.Test;

public class TestNgFeature {
	@Test
	public void Logintest(){
		System.out.println("Login Page Test Case");
	}
	@Test
	public void Homepagetest(){
		System.out.println("Home Page Test Case");
		int i=9/0;
	}
	@Test (dependsOnMethods="Homepagetest")
	public void SearchPagetest(){
		System.out.println("Search Page Test depends On Homepagetest Methods ");
	}

}
