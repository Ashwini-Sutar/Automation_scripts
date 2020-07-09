package com.selenium.demo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

public class DisAppearingPage extends WebDriverInit {

	WebDriver driver;
	WebElement delele;
	WebElement addele;

	@FindBy(linkText = "Add/Remove Elements")
	WebElement arlink;

	@FindBy(tagName = "h3")
	WebElement heading;

	By addButton = By.tagName("button");

	By deleteButton = By.className("added-manually");

	public ARElements(WebDriver driver) {

		this.driver = driver;

	}

	public String returnHeader() {

		arlink.click();

		return heading.getText();

	}

	public boolean addButton() {

		addele = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(addButton);
			}

		}));

		if (addele.isDisplayed())

			addele.click();

		delele = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(deleteButton);
			}

		}));
		return delele.isDisplayed();

	}

	public boolean deleleTesting() {

		if (delele.isDisplayed())

			delele.click();

		return addele.isDisplayed();

	}
}
