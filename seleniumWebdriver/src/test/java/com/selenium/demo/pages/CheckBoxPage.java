package com.selenium.demo.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class CheckBoxPage {

	WebDriver driver;

	@FindBy(linkText = "Checkboxes")
	WebElement checkBoxlink;

	@FindBy(tagName = "h3")
	WebElement header;

	@FindBy(xpath = "//*[@id='checkboxes']/input[1]")
	WebElement frstchbx;

	@FindBy(xpath = "//*[@id='checkboxes']/input[2]")
	WebElement scndchbx;

	public CheckBoxPage(WebDriver driver) {

		this.driver = driver;

	}

	public String returnHeader(){

		checkBoxlink.click();

		return header.getText();

	}

	public boolean frstCheckBox() {

		if (!frstchbx.isSelected())

			frstchbx.click();
		return frstchbx.isSelected();

	}

	public boolean secndCheckBox() {

		if (!scndchbx.isSelected())

			scndchbx.click();
		
		return scndchbx.isSelected();

	}

}