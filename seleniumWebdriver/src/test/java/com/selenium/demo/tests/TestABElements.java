package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.ABElements;

import com.selenium.demo.pages.WebDriverInit;

public class TestABElements extends WebDriverInit {

	ABElements aBElements;

	@Test(priority = 3)

	public void testHeader() throws InterruptedException {

		// ExtentTest test = extent.createTest("Test Header", "Test Header Display");

		aBElements = PageFactory.initElements(driver, ABElements.class);

		String heading = aBElements.returnHeader();

		assertEquals(heading, "A/B Test Control");

	}

	@Test(priority = 4)

	public void testContent() throws InterruptedException {

		String actualContent = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";

		String content = aBElements.returnContent();

		assertEquals(content, actualContent);

	}
}