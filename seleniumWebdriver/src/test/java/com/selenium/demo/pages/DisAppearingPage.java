package com.selenium.demo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

public class DisAppearingPage extends WebDriverInit {

	WebDriver driver;
	WebElement homeEle;
	WebElement galleryEle;
	WebElement portfolio;
	WebElement contactEle;
	WebElement abtEle;

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

	public String clickOnHome() {

		homeEle = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(homeButton);
			}

		}));

		if (homeEle.isDisplayed())

			homeEle.click();

		return driver.getCurrentUrl();

	}

	public String clickOnAbout() {

		disappearingElements.click();

		abtEle = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(aboutButton);
			}

		}));

		if (abtEle.isDisplayed())

			abtEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnContactUs() {

		contactEle = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(contactUsButton);
			}

		}));

		if (contactEle.isDisplayed())

			contactEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnportfolio() {

		portfolio = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(portfolioButton);
			}

		}));

		if (portfolio.isDisplayed())

			portfolio.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}

	public String clickOnGalleryButton() {

		galleryEle = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(galleryButton);
			}

		}));

		if (galleryEle.isDisplayed())

			galleryEle.click();

		title = mesg.getText();

		driver.navigate().back();

		return title;

	}
}
