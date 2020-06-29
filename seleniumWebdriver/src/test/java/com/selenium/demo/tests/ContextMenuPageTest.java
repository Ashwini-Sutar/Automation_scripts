package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.ContextMenuPage;

import com.selenium.demo.pages.WebDriverInit;

public class ContextMenuPageTest extends WebDriverInit {

	ContextMenuPage contextMenuPage;

	@Test(priority = 12)

	public void testHeaderCheckBox() throws InterruptedException {

		contextMenuPage = PageFactory.initElements(driver, ContextMenuPage.class);

		String cntxtHeader = contextMenuPage.returnheader();

		assertEquals(cntxtHeader, "Context Menu");

	}

	@Test(priority = 13)

	public void testfrstStmt() throws InterruptedException {

		assertEquals(contextMenuPage.returnfirstContent(),
				"Context menu items are custom additions that appear in the right-click menu.");

	}

	@Test(priority = 14)

	public void testSecndCheckBox() throws InterruptedException {

		assertEquals(contextMenuPage.returnSecondContent(),
				"Right-click in the box below to see one called 'the-internet'. When you click it, it will trigger a JavaScript alert.");

	}

	@Test(priority = 15)

	public void testAlertBox() throws InterruptedException {

		String alrtMesg = contextMenuPage.alertBoxTesting();

		assertEquals(alrtMesg, "You selected a context menu");

	}

}
