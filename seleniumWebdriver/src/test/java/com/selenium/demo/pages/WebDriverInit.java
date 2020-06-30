package com.selenium.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class WebDriverInit {

	public static WebDriver driver;

	public static WebDriverWait webdriverwait;

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
        
	    webdriverwait = new WebDriverWait(driver, 30);
		  
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
