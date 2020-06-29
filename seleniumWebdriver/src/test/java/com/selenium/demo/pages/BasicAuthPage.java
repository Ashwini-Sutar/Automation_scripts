package com.selenium.demo.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class BasicAuthPage {

	WebDriver driver;

	@FindBy(tagName = "p")
	WebElement loginMesg;

	public BasicAuthPage(WebDriver driver) {

		this.driver = driver;

	}

	public String loginMesg() throws InterruptedException {

		Thread.sleep(1500);

		return loginMesg.getText();

	}

}
