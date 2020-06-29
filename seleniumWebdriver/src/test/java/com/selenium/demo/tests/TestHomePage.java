package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.HomePage;

import com.selenium.demo.pages.WebDriverInit;

public class TestHomePage extends WebDriverInit {

	HomePage homePage;

	@Test(priority = 0)

	public void testFirstHeader() throws InterruptedException {

		homePage = PageFactory.initElements(driver, HomePage.class);

		String frstHeader = homePage.firstHeaderCheck();

		assertEquals(frstHeader, "Welcome to the-internet");

	}

	@Test(priority = 1)

	public void testSecondHeader() throws InterruptedException {

		String scndHeader = homePage.secondHeaderCheck();

		assertEquals(scndHeader, "Available Examples");

	}

	@Test(priority = 2)

	public void tsetClickOnLink() throws InterruptedException {

		homePage.clickOnLink();

	}

}