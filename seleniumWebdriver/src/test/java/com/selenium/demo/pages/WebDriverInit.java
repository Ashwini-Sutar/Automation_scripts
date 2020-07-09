package com.selenium.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class WebDriverInit {

	public static WebDriver driver;

	public static Wait<WebDriver> wait;

	public static String AppUrl = "http://the-internet.herokuapp.com/";

	@BeforeClass

	public static WebDriver launchBrowser() throws InterruptedException {

		System.out.println("starting firefox browser");

		
		  System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		  
		  driver = new FirefoxDriver();
		 
		
		/*
		 * System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
		 * 
		 * driver=new InternetExplorerDriver();
		 */
        
	    wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(AppUrl);

		return driver;

	}

	@AfterClass

	public static void closeDriver() {

		if (driver != null) {

			driver.quit();

		}

	}

}
