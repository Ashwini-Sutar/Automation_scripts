package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.BasicAuthPage;

import com.selenium.demo.pages.WebDriverInit;

public class BasicAuthTest extends WebDriverInit {

	BasicAuthPage basicAuthPage;

	String sucessCred = "http://admin:admin@the-internet.herokuapp.com/basic_auth";

	@Test(priority = 8)

	public void sucessTestAuthontication() throws InterruptedException {

		driver.get(sucessCred);

		basicAuthPage = PageFactory.initElements(driver, BasicAuthPage.class);

		String mesg = basicAuthPage.loginMesg();

		assertEquals(mesg, "Congratulations! You must have the proper credentials.");

	}

}