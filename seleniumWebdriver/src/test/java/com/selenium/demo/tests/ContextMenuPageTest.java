package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.ContextMenuPage;

import com.selenium.demo.pages.WebDriverInit;

public class ContextMenuPageTest extends WebDriverInit {

	ContextMenuPage contextMenuPage;

	@Test(priority = 12, description = "Testing of Header and it should be Context Menu", groups= {"text"})

	public void testHeaderCheckBox() {

		contextMenuPage = PageFactory.initElements(driver, ContextMenuPage.class);

		String cntxtHeader = contextMenuPage.returnheader();

		assertEquals(cntxtHeader, "Context Menu");

	}

	@Test(priority = 13, description = "Testing of content in context menu page", groups= {"text"})

	public void testfrstStmt() {

		assertEquals(contextMenuPage.returnfirstContent(),
				"Context menu items are custom additions that appear in the right-click menu.");

	}

	@Test(priority = 14, description = "Testing of action mesg", groups= {"clickevents"})

	public void testSecndContent() {

		assertEquals(contextMenuPage.returnSecondContent(),
				"Right-click in the box below to see one called 'the-internet'. When you click it, it will trigger a JavaScript alert.");

	}

	@Test(priority = 15, description = "cliciking on context menu and verifying alert box message", groups= {"clickevents"})

	public void testAlertBox(){

		String alrtMesg = contextMenuPage.alertBoxTesting();

		assertEquals(alrtMesg, "You selected a context menu");

	}

}
