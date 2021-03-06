package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.HomePage;

import com.selenium.demo.pages.WebDriverInit;

public class TestHomePage extends WebDriverInit {

	HomePage homePage;
	@Test(priority = 0, description = "Tesing Header of home page and it should be Welcome to the-internet", groups= {"text"})

	public void testFirstHeader() {

		homePage = PageFactory.initElements(driver, HomePage.class);

		String frstHeader = homePage.firstHeaderCheck();

		assertEquals(frstHeader, "Welcome to the-internet");

	}

	@Test(priority = 1, description = "testing secondnext header of the home page", groups= {"text"})
	
	public void testSecondHeader() {

		String scndHeader = homePage.secondHeaderCheck();

		assertEquals(scndHeader, "Available Examples");

	}

	@Test(priority = 2, description= "Click on each link of the page test whether navigating to right URL or not", groups= {"clickevents"})

	public void tsetClickOnLink() {

		homePage.clickOnLink();

	}

}