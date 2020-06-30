package com.selenium.demo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ARElements extends WebDriverInit {

	WebDriver driver;

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

		WebElement addele = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(addButton));

		if (addele.isDisplayed())

			addele.click();

		WebElement delele = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));

		return delele.isDisplayed();

	}

	public boolean deleleTesting() {

		 WebElement delele 	= webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));

		if (delele.isDisplayed())

			delele.click();

		 WebElement addele =  webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(addButton));

	return	 addele.isDisplayed();

	}

}
