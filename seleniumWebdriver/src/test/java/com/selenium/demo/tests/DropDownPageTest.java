package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.DropDownPage;

import com.selenium.demo.pages.WebDriverInit;

public class DropDownPageTest extends WebDriverInit {

	DropDownPage dropDownPage;

	@Test(priority = 22)

	public void testHeaderOfDropDown() throws InterruptedException {

		dropDownPage = PageFactory.initElements(driver, DropDownPage.class);

		String header = dropDownPage.returnHeader();

		assertEquals(header, "Dropdown List");

	}

	@Test(priority = 23)

	public void testdefaultValue() throws InterruptedException {

		String dfaultvalue = dropDownPage.returnDefaultText();

		assertEquals(dfaultvalue, "Please select an option");

	}

	@Test(priority = 24)

	public void testOption1() throws InterruptedException {

		assertEquals(dropDownPage.selectOption1(), "Option 1");

	}

	@Test(priority = 25)

	public void testOption2() throws InterruptedException {

		assertEquals(dropDownPage.selectOption2(), "Option 2");

	}
}