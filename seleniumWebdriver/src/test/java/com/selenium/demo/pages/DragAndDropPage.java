package com.selenium.demo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropPage {

	private WebDriver driver;

	private WebDriverWait webdriverwait;

	private Actions action;

	@FindBy(linkText = "Drag and Drop")
	WebElement dragadrop;

	By src = By.id("column-a");

	By dest = By.id("column-b");

	public DragAndDropPage(WebDriver driver) {

		this.driver = driver;

	}

	  public void dragandDrop(){
	  
	  dragadrop.click();
	  
	  webdriverwait = WebDriverInit.webdriverwait;
	  
	  
	  WebElement headerAEle = webdriverwait
	  
	  .until(ExpectedConditions.visibilityOfElementLocated(src));
	  
	  WebElement headerBEle = webdriverwait
	  
	  .until(ExpectedConditions.visibilityOfElementLocated(dest));
	  
	  action = new Actions(driver);
	  
	  System.out.println(headerAEle.getText());
	  
	  System.out.print(headerBEle.getText());
	  
	  if (headerAEle.isDisplayed() && headerBEle.isDisplayed()) {
	  
	  action.clickAndHold(headerAEle).moveToElement(headerBEle).release().build().
	  perform();
	  
	  System.out.print(headerBEle.getText());
	  
	  Thread.sleep(1500);
	  
	  }
	  
	  }
	  
	
}
