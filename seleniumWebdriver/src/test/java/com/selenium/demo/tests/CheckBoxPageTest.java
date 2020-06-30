package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.CheckBoxPage;

import com.selenium.demo.pages.WebDriverInit;

public class CheckBoxPageTest extends WebDriverInit {

	CheckBoxPage checkBoxPage;

	@Test(priority = 9, description = "Testing of Page heading and it should be Checkboxes", groups= {"text"})

	public void testHeaderCheckBox() {

		checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);

		String checkboxHeader = checkBoxPage.returnHeader();

		assertEquals(checkboxHeader, "Checkboxes");

	}

	@Test(priority = 10, description = "click on first checkbox", groups= {"clickevents"})

	public void testfrstCheckBox() {
		
		assertTrue(checkBoxPage.frstCheckBox());

	}

	@Test(priority = 11, description = "click on second checkbox", groups= {"clickevents"})

	public void testSecndCheckBox() {
		
		assertTrue(checkBoxPage.secndCheckBox());

	}

}
