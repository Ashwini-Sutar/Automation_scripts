package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.ARElements;

import com.selenium.demo.pages.WebDriverInit;

public class TestARElements extends WebDriverInit {

	ARElements aRElements;

	@Test(priority = 5, description = "Heading of the page should be Add/ Remove Elements", groups= {"text"})

	public void testHeader() {

		aRElements = PageFactory.initElements(driver, ARElements.class);

		String heading = aRElements.returnHeader();

		assertEquals(heading, "Add/Remove Elements");

	}

	@Test(priority = 6, description = "Clicking on add button and displaying remove button", groups= {"clickevents"})

	public void testAddButton(){

		assertTrue(aRElements.addButton());

	}

	@Test(priority = 7, description = "Clicking on delete button and hiding remove button", groups= {"clickevents"})

	public void testDelButton(){

		assertTrue(aRElements.deleleTesting());

	}

}