package com.selenium.demo.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ABElements {

	WebDriver driver;

	@FindBy(linkText = "A/B Testing")
	WebElement abtest;

	@FindBy(tagName = "h3")
	WebElement heading;

	@FindBy(xpath = "//*[@id='content']/div/p")
	WebElement content;

	public ABElements(WebDriver driver) {

		this.driver = driver;

	}

	public String returnHeader() throws InterruptedException {

		abtest.click();

		Thread.sleep(1500);

		return heading.getText();

	}

	public String returnContent() throws InterruptedException {

		Thread.sleep(1500);

		return content.getText();

	}

}
