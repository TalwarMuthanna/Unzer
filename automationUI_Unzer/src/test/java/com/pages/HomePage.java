package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Utility;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='board-tile mod-add']")

	WebElement createboardbutton;

	@FindBy(xpath = "//*[@data-test-id='create-board-title-input']")

	WebElement boardname;

	@FindBy(xpath = "//*[@data-test-id='create-board-submit-button']")

	WebElement createbutton;

	@FindBy(xpath = "//button[@data-test-id='create-from-template-button']")

	WebElement templatebutton;

	Utility oUtility;

	/**
	 * This Method is to verify the Home page
	 */
	public void VerifyHomepage() {
		oUtility = new Utility();
		oUtility.explicitWait(driver, createboardbutton);
		createboardbutton.isDisplayed();
	}

	/**
	 * This Method is used to create a board
	 * 
	 * @param name
	 */
	public void CreateBoard(String name) {
		createboardbutton.click();
		oUtility.explicitWait(driver, createbutton);
		boardname.sendKeys(name);
		oUtility.mouseHover(driver, templatebutton);
		oUtility.wait(2);
		createbutton.click();

	}

}
