package com.selenium.demo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class DisAppearingPage extends WebDriverInit {

	WebDriver driver;

	WebDriverWait webdriverwait;

	@FindBy(linkText = "Disappearing Elements")
	WebElement disappearingElements;

	
	  By homeButton = By.linkText("Home");
	  
	  By aboutButton = By.linkText("About");
	  
	  By contactUsButton = By.linkText("Contact Us");
	  
	  By portfolioButton = By.linkText("Portfolio");
	  
	  By galleryButton = By.linkText("Gallery");
	 

	@FindBy(linkText = "Gallery")
	WebElement galleryEle;

	
	@FindBy(tagName = "h1")
	WebElement mesg;
	String title;

	public DisAppearingPage(WebDriver driver) {

		this.driver = driver;

	}

	public String clickOnHome() {

		webdriverwait = WebDriverInit.webdriverwait;

		 WebElement homeEle =
		 webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(homeButton));

		if (homeEle.isDisplayed())

			homeEle.click();

		return driver.getCurrentUrl();

	}

	public String clickOnAbout() {

		disappearingElements.click();

		webdriverwait = WebDriverInit.webdriverwait;

		 WebElement abtEle =
		 webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(aboutButton));

		if (abtEle.isDisplayed())

			abtEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnContactUs()
	{

		webdriverwait = WebDriverInit.webdriverwait;

		 WebElement contactEle =
		 webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(contactUsButton));

		if (contactEle.isDisplayed())

			contactEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnportfolio() {

		webdriverwait = WebDriverInit.webdriverwait;

		 WebElement portfolio =
		 webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(portfolioButton));

		if (portfolio.isDisplayed())

			portfolio.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnGalleryButton() {

		webdriverwait = WebDriverInit.webdriverwait;

		// WebElement galleryEle =
		// webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(galleryButton));

		if (galleryEle.isDisplayed())

			galleryEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

}
