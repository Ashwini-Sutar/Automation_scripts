package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.DropDownPage;

import com.selenium.demo.pages.WebDriverInit;

public class DropDownPageTest extends WebDriverInit {

	DropDownPage dropDownPage;

	@Test(priority = 22, description = "The header of the dropdown page should be dropdownList", groups= {"text"})

	public void testHeaderOfDropDown(){

		dropDownPage = PageFactory.initElements(driver, DropDownPage.class);

		String header = dropDownPage.returnHeader();

		assertEquals(header, "Dropdown List");

	}

	@Test(priority = 23, description = "Test default value of dropdown", groups= {"text"})

	public void testdefaultValue() {

		String dfaultvalue = dropDownPage.returnDefaultText();

		assertEquals(dfaultvalue, "Please select an option");

	}

	@Test(priority = 24, description = "select option 1 value from dropdown", groups= {"clickevents"})

	public void testOption1() {

		assertEquals(dropDownPage.selectOption1(), "Option 1");

	}

	@Test(priority = 25, description= "select option2 from dropdown", groups= {"clickevents"})

	public void testOption2() {

		assertEquals(dropDownPage.selectOption2(), "Option 2");

	}
}