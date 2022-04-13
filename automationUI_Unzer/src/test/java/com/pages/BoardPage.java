package com.pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utility;

public class BoardPage {

	WebDriver driver;

	public BoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='list-name-input']")

	WebElement listtitletextbox;

	@FindBy(xpath = "//*[@value='Add list']")

	WebElement addlistbutton;

	@FindBy(xpath = "//*[text()='Add a card']")

	WebElement addacardbutton;

	@FindBy(xpath = "//*[@placeholder='Enter a title for this card…']")

	WebElement cardtextbox;

	@FindBy(xpath = "//*[@value='Add card']")

	WebElement addcardbutton;

	@FindBy(xpath = "//a[@class='icon-lg icon-close dark-hover js-cancel']")

	WebElement cancelbutton;

	@FindBy(xpath = "//*[text()='Add another list']")

	WebElement addanotherlistbutton;

	@FindBy(xpath = "(//*[text()='Add a card'])[2]")

	WebElement addacardbutton1;

	@FindBy(xpath = "(//*[@class='list-header-extras-menu dark-hover js-open-list-menu icon-sm icon-overflow-menu-horizontal'])[1]")

	WebElement listmenubutton;

	@FindBy(xpath = "//*[text()='Move all cards in this list…']")

	WebElement movecardsbutton;

	@FindBy(xpath = "//a[text()='Automation Testing']")

	WebElement anotherlistname;

	@FindBy(xpath = "(//*[@class='icon-sm icon-edit list-card-operation dark-hover js-open-quick-card-editor js-card-menu'])[2]")

	WebElement editcard;

	@FindBy(xpath = "//*[text()='Edit labels']")

	WebElement editlabels;

	@FindBy(xpath = "//*[@data-color='green']")

	WebElement greencolor;

	@FindBy(xpath = "//*[@value='Save']")

	WebElement savebutton;

	@FindBy(xpath = "(//*[text()='Writing Manual testcases'])[1]")

	WebElement addedlist;

	@FindBy(xpath = "//div[2]/div/div[2]/a/div[3]/span[@class='list-card-title js-card-name']")

	WebElement movedCard;

	@FindBy(xpath = "//*[@class='card-label card-label-green mod-card-front']")

	WebElement updatedCard;

	Utility oUtility;

	/**
	 * This Method is to verify the Home page
	 */
	public void VerifyBoardpage() {
		oUtility = new Utility();
		oUtility.explicitWait(driver, listtitletextbox);
		listtitletextbox.isDisplayed();
	}

	/**
	 * This Method is used create a list
	 * 
	 * @param listname
	 */
	public void CreateList(String listname) {
		listtitletextbox.sendKeys(listname);
		addlistbutton.click();
	}

	/**
	 * This Method is used to add a card to list
	 * 
	 * @param cardname
	 */
	public void AddaCard(String cardname) {
		addacardbutton.click();
		cardtextbox.sendKeys(cardname);
		addcardbutton.click();
	}

	/**
	 * This Method is to verify the Home page
	 */
	public void Verifyaddedlist() {
		oUtility.wait(2);
		oUtility.explicitWait(driver, addedlist);
		addedlist.isDisplayed();
	}

	/**
	 * This Method is used to click on cross mark button
	 */
	public void Clickcancelbutton() {
		cancelbutton.click();
	}

	/**
	 * This Method is used to click on cross mark button
	 */
	public void ClickonAddanotherlist() {
		addanotherlistbutton.click();
	}

	/**
	 * This Method is used to add a card to list
	 * 
	 * @param cardname
	 */
	public void AddaCardToSecondlist(String cardname) {
		addacardbutton1.click();
		cardtextbox.sendKeys(cardname);
		addcardbutton.click();
	}

	/**
	 * This Method is used to move card from one list to another
	 */
	public void Movrcards() {
		listmenubutton.click();
		movecardsbutton.click();
		anotherlistname.click();
	}

	/**
	 * This Method is used to verify the moved card
	 */
	public void verifyMovedCards() {
		oUtility.explicitWait(driver, movedCard);
		movedCard.isDisplayed();
	}

	/**
	 * This Method is used to edit the task
	 */
	public void Edittask() {
		editcard.click();
		editlabels.click();
		greencolor.click();
		savebutton.click();
	}

	/**
	 * This Method is used to verify the moved card
	 */
	public void verifyupdatedCards() {
		oUtility.explicitWait(driver, updatedCard);
		updatedCard.isDisplayed();
		driver.quit();
	}
}
