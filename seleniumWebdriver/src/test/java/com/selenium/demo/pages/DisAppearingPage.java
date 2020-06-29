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
	 

	@FindBy(tagName = "h1")
	WebElement mesg;
	String title;

	public DisAppearingPage(WebDriver driver) {

		this.driver = driver;

	}

	public String clickOnHome() throws InterruptedException {

		webdriverwait = WebDriverInit.webdriverwait;

		Thread.sleep(1500);

		WebElement homeEle = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(homeButton));

		if (homeEle.isDisplayed())

			homeEle.click();

		return driver.getCurrentUrl();

	}

	public String clickOnAbout() throws InterruptedException {

		disappearingElements.click();

		webdriverwait = WebDriverInit.webdriverwait;

		Thread.sleep(1500);

     	WebElement abtEle = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(aboutButton));

		if (abtEle.isDisplayed())

			abtEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnContactUs() throws InterruptedException {

		webdriverwait = WebDriverInit.webdriverwait;

		Thread.sleep(1500);

		WebElement contactEle = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(contactUsButton));

		if (contactEle.isDisplayed())

			contactEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnportfolio() throws InterruptedException {

		webdriverwait = WebDriverInit.webdriverwait;

		Thread.sleep(1500);

		WebElement portfolio = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(portfolioButton));

		if (portfolio.isDisplayed())

			portfolio.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnGalleryButton() throws InterruptedException {

		webdriverwait = WebDriverInit.webdriverwait;

		Thread.sleep(1500);

		WebElement galleryEle = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(galleryButton));

		if (galleryEle.isDisplayed())

			galleryEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

}
