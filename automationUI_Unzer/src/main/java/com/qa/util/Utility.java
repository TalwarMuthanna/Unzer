package com.qa.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	/**
	 * This Method is used to wait until all the elements of the page gets
	 * loaded
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * This Method is used to wait until given element in the page is loaded
	 */
	public void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This Method is used to mouse hover on the given element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	/**
	 * This Method is used to stop the execution for given time
	 * 
	 * @param tSeconds
	 */
	public void wait(int tSeconds) {
		tSeconds = tSeconds * 1000;
		try {
			Thread.sleep(tSeconds);
		} catch (InterruptedException e) {
		}
	}

}
