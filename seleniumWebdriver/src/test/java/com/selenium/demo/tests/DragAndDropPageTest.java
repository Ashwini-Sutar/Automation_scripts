package com.selenium.demo.tests;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.DragAndDropPage;

import com.selenium.demo.pages.WebDriverInit;

public class DragAndDropPageTest extends WebDriverInit {

	DragAndDropPage dragAndDropPage;

	@Test(priority = 21)

	public void testHeaderCheckBox() throws InterruptedException {

		dragAndDropPage = PageFactory.initElements(driver, DragAndDropPage.class);

		//dragAndDropPage.dragandDrop();

	}

}
