package com.selenium.demo.pages;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage {

	WebDriver driver;

	WebDriverWait webdriverwait;

	@FindBy(linkText = "Context Menu")
	WebElement CntxtMenu;

	@FindBy(tagName = "h3")
	WebElement heading;

	@FindBy(xpath = "//*[@id='content']/div/p[1]")
	WebElement fisrtLineContent;

	@FindBy(xpath = "//*[@id='content']/div/p[2]")
	WebElement scndLineContent;

	@FindBy(xpath = "//*[@id='hot-spot']")
	WebElement htspt;

	public ContextMenuPage(WebDriver driver) {

		this.driver = driver;

	}

	public String returnheader() throws InterruptedException {

		CntxtMenu.click();

		Thread.sleep(1500);

		return heading.getText();

	}

	public String returnfirstContent() throws InterruptedException {

		Thread.sleep(1500);

		return fisrtLineContent.getText();

	}

	public String returnSecondContent() throws InterruptedException {

		Thread.sleep(1500);

		return scndLineContent.getText();

	}

	public String alertBoxTesting() throws InterruptedException {

		Actions action = new Actions(driver);

		action.contextClick(htspt).perform();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(5000);

		String alrtMesg = alert.getText();

		alert.accept();

		return alrtMesg;

	}

}
