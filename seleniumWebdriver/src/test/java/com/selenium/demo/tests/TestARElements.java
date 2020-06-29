package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.ARElements;

import com.selenium.demo.pages.WebDriverInit;

public class TestARElements extends WebDriverInit {

	ARElements aRElements;

	@Test(priority = 5)

	public void testHeader() throws InterruptedException {

		aRElements = PageFactory.initElements(driver, ARElements.class);

		String heading = aRElements.returnHeader();

		assertEquals(heading, "Add/Remove Elements");

	}

	@Test(priority = 6)

	public void testAddButton() throws InterruptedException {

		assertTrue(aRElements.addButton());

	}

	@Test(priority = 7)

	public void testDelButton() throws InterruptedException {

		assertTrue(aRElements.deleleTesting());

	}

}