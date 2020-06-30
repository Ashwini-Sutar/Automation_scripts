package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.ABElements;

import com.selenium.demo.pages.WebDriverInit;

public class TestABElements extends WebDriverInit {

	ABElements aBElements;

	@Test(priority = 3, description = "Header of the AB Elements should be A/B Test Control", groups= {"text"})

	public void testHeader(){

		// ExtentTest test = extent.createTest("Test Header", "Test Header Display");

		aBElements = PageFactory.initElements(driver, ABElements.class);

		String heading = aBElements.returnHeader();

		assertEquals(heading, "A/B Test Control");

	}

	@Test(priority = 4, description = "Testing the content of the page", groups= {"text"})

	public void testContent() {

		String actualContent = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";

		String content = aBElements.returnContent();

		assertEquals(content, actualContent);

	}
}