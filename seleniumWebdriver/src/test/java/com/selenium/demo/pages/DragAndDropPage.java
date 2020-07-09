package com.selenium.demo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

import com.selenium.demo.pages.WebDriverInit;

public class DragAndDropPage{

	private WebDriver driver;
	
	WebElement headerBEle;
	WebElement headerAEle;

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
	  
	  headerAEle = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(src);
			}

		}));
	  
	  headerBEle = wait.until((new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(dest);
			}

		}));
	  
	  action = new Actions(driver);
	  
	  System.out.println(headerAEle.getText());
	  
	  System.out.print(headerBEle.getText());
	  
	  if (headerAEle.isDisplayed() && headerBEle.isDisplayed()) {
	  
	  action.clickAndHold(headerAEle).moveToElement(headerBEle).release().build().
	  perform();
	  
	  System.out.print(headerBEle.getText());
	  
	  }
	  
	  }
	  
	
}
