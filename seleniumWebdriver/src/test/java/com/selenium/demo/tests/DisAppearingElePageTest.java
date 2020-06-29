package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.DisAppearingPage;

import com.selenium.demo.pages.WebDriverInit;

public class DisAppearingElePageTest extends WebDriverInit {

	DisAppearingPage disAppearingPage;

	@Test(priority = 16)

	public void testAboutBox() throws InterruptedException {

		disAppearingPage = PageFactory.initElements(driver, DisAppearingPage.class);

		String abtmesg = disAppearingPage.clickOnAbout();

		assertEquals(abtmesg, "Not Found");

	}

	@Test(priority = 17)

	public void testContactUsButton() throws InterruptedException {

		String contMesg = disAppearingPage.clickOnContactUs();

		assertEquals(contMesg, "Not Found");

	}

	@Test(priority = 18)

	public void testPortfolio() throws InterruptedException {

		String portfolioMesg = disAppearingPage.clickOnportfolio();

		assertEquals(portfolioMesg, "Not Found");

	}

	@Test(priority = 19)

	public void testGalleryButton() throws InterruptedException {

		String galleryMesg = disAppearingPage.clickOnGalleryButton();

		assertEquals(galleryMesg, "Not Found");

	}

	@Test(priority = 20)

	public void testHomeButton() throws InterruptedException {

		String HomeMesg = disAppearingPage.clickOnHome();

		assertEquals(HomeMesg, "http://the-internet.herokuapp.com/");

	}

}