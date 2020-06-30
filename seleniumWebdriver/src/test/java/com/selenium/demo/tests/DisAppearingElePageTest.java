package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.selenium.demo.pages.DisAppearingPage;

import com.selenium.demo.pages.WebDriverInit;

public class DisAppearingElePageTest extends WebDriverInit {

	DisAppearingPage disAppearingPage;

	@Test(priority = 16, description = "Click on about button Not Found should be displayed", groups= {"text"})

	public void testAboutBox(){
		disAppearingPage = PageFactory.initElements(driver, DisAppearingPage.class);

		String abtmesg = disAppearingPage.clickOnAbout();

		assertEquals(abtmesg, "Not Found");

	}

	@Test(priority = 17, description = "Click on contact us button Not Found should be displayed",groups= {"clickevents"})

	public void testContactUsButton()  {

		String contMesg = disAppearingPage.clickOnContactUs();

		assertEquals(contMesg, "Not Found");

	}

	@Test(priority = 18,  description = "Click on portfolio button Not Found should be displayed", groups= {"clickevents"})

	public void testPortfolio(){

		String portfolioMesg = disAppearingPage.clickOnportfolio();

		assertEquals(portfolioMesg, "Not Found");

	}

	@Test(priority = 19,  description = "Click on gallery button Not Found should be displayed")

	public void testGalleryButton() {

		String galleryMesg = disAppearingPage.clickOnGalleryButton();

		assertEquals(galleryMesg, "Not Found");

	}

	@Test(priority = 20,  description = "Click on home button it should navigate to home page", groups= {"clickevents"})

	public void testHomeButton(){

		String HomeMesg = disAppearingPage.clickOnHome();

		assertEquals(HomeMesg, "http://the-internet.herokuapp.com/");

	}

}