package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.CheckBoxPage;

import com.selenium.demo.pages.WebDriverInit;

public class CheckBoxPageTest extends WebDriverInit {

	CheckBoxPage checkBoxPage;

	@Test(priority = 9)

	public void testHeaderCheckBox() throws InterruptedException {

		checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);

		String checkboxHeader = checkBoxPage.returnHeader();

		assertEquals(checkboxHeader, "Checkboxes");

	}

	@Test(priority = 10)

	public void testfrstCheckBox() throws InterruptedException {
		
		assertTrue(checkBoxPage.frstCheckBox());

	}

	@Test(priority = 11)

	public void testSecndCheckBox() throws InterruptedException {
		
		assertTrue(checkBoxPage.secndCheckBox());

	}

}
