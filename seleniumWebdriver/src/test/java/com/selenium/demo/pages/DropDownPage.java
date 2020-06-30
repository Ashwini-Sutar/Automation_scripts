package com.selenium.demo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

	Select select;

	List<WebElement> allOptions;

	@FindBy(linkText = "Dropdown")
	WebElement dropdown;

	@FindBy(tagName = "h3")
	WebElement header;

	@FindBy(id = "dropdown")
	WebElement drpdwn;
	

	WebDriver driver;

	public DropDownPage(WebDriver driver) {

		this.driver = driver;
	}

	public String returnHeader() {

		dropdown.click();

		return header.getText();

	}

	public String returnDefaultText() {

		select = new Select(drpdwn);

		return select.getFirstSelectedOption().getText();

	}

	public String selectOption1() {

		allOptions = select.getOptions();

		for (WebElement element : allOptions)

			if (element.getText().contains("Option 1"))

				element.click();

		return select.getFirstSelectedOption().getText();

	}

	public String selectOption2() {

		for (WebElement element : allOptions)

			if (element.getText().contains("Option 2"))

				element.click();

		return select.getFirstSelectedOption().getText();

	}

}