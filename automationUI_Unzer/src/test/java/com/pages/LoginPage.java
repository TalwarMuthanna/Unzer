package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Utility;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='btn btn-sm btn-link text-primary']")

	WebElement login;

	@FindBy(xpath = "//*[@id='user']")

	WebElement username;

	@FindBy(xpath = "//*[@id='login']")

	WebElement atlassianLoginButton;

	@FindBy(xpath = "//*[@id='password']")

	WebElement password;

	@FindBy(xpath = "//*[@id='login-submit']")

	WebElement loginButton;

	Utility oUtility;
	/**
	 * This Method is to verify the Home page
	 */
	public void VerifyLoginpage() {
		login.isDisplayed();
	}
	
	/**
	 * This Method is used to click on login
	 */
	public void ClickLogin() {
		login.click();
	}

	/**
	 * This Method is used to enter username and click on atlassian login button
	 * 
	 * @param email
	 */
	public void EnterUsername(String email) {
		oUtility = new Utility();
		oUtility.explicitWait(driver,username);
		username.sendKeys(email);
		atlassianLoginButton.click();
	}

	/**
	 * This Method is used to enter password and click on login button
	 * 
	 * @param email
	 */
	public void EnterPassword(String Password) {
		oUtility.explicitWait(driver,loginButton);
		password.sendKeys(Password);
		loginButton.click();
	}
	
}
