package com.selenium.demo.pages;

import static org.testng.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	String url = "http://the-internet.herokuapp.com/";

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(tagName = "h1")
	WebElement firstHeader;

	@FindBy(tagName = "h2")
	WebElement secondHeader;

	@FindBy(tagName = "a")
	List<WebElement> allHomePagelink;

	public String firstHeaderCheck() throws InterruptedException {

		Thread.sleep(500);

		System.out.print(firstHeader.getText());

		return firstHeader.getText();

	}

	public String secondHeaderCheck() throws InterruptedException {

		Thread.sleep(500);

		return secondHeader.getText();

	}

	public void clickOnLink() throws InterruptedException {
	    
		System.out.print(allHomePagelink.size());

		Thread.sleep(1500);

		for (int i = 0; i < allHomePagelink.size(); i++)

		{

			if (!(allHomePagelink.get(i).getText().isEmpty())
					&& !((allHomePagelink.get(i).getText().equals("Basic Auth"))

							|| (allHomePagelink.get(i).getText().equals("Digest Authentication"))
							|| (allHomePagelink.get(i).getText().equals("Secure File Download"))
							|| (allHomePagelink.get(i).getText().equals("Elemental Selenium")))) {

				allHomePagelink.get(i).click();
				
				  assertNotEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/");
				
				Thread.sleep(1000);

				driver.navigate().back();

				allHomePagelink = driver.findElements(By.tagName("a"));

			}

		}

		Thread.sleep(3000);

	}

}