package stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BoardPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageSteps {

	WebDriver driver;
	HomePage oHomePage;
	BoardPage oBoardPage;
	LoginPage oLoginPage;
	ConfigReader configReader = new ConfigReader();
	Properties prop = configReader.init_prop();

	@Given("launch chrome browser")
	public void launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Then("I should see Login page")
	public void i_should_see_login_page() {
		oLoginPage = new LoginPage(driver);
		oLoginPage.VerifyLoginpage();
	}

	@When("User click on login")
	public void user_click_on_login() {
		oLoginPage.ClickLogin();
	}

	@When("User Enter Username and click on atlassian login button")
	public void user_enter_username_and_click_on_atlassian_login_button() {
		String UserName = prop.getProperty("email");
		oLoginPage.EnterUsername(UserName);
	}

	@When("User Enter Password and click on login button")
	public void user_enter_password_and_click_on_login_button() {
		String Password = prop.getProperty("password");
		oLoginPage.EnterPassword(Password);
	}

	@Then("I should see Home Screen")
	public void i_should_see_home_screen() {
		oHomePage = new HomePage(driver);
		oHomePage.VerifyHomepage();
	}

	@When("User create a board")
	public void user_create_a_board() {
		String BoardName = prop.getProperty("board");
		oHomePage.CreateBoard(BoardName);
	}

	@Then("I should see board Screen")
	public void i_should_see_board_screen() {
		oBoardPage = new BoardPage(driver);
		oBoardPage.VerifyBoardpage();
	}

	@When("User create a list")
	public void user_create_a_list() {
		String List = prop.getProperty("listname1");
		oBoardPage.CreateList(List);
	}

	@When("User adds a card to the list")
	public void user_adds_a_card_to_the_list() {
		String card = prop.getProperty("cardname1");
		oBoardPage.AddaCard(card);
	}

	@Then("I should see new list and card in the list")
	public void i_should_see_new_list_and_card_in_the_list() {
		oBoardPage.Verifyaddedlist();
	}

	@When("User click on cancel button")
	public void user_click_on_cancel_button() {
		oBoardPage.Clickcancelbutton();
	}

	@When("User click on Add another list button")
	public void user_click_on_add_another_list_button() {
		oBoardPage.ClickonAddanotherlist();
	}

	@When("User create a  another list")
	public void user_create_a_another_list() {
		String List = prop.getProperty("listname2");
		oBoardPage.CreateList(List);
	}

	@When("User adds a card to the Second list")
	public void user_adds_a_card_to_the_second_list() {
		String card = prop.getProperty("cardname2");
		oBoardPage.AddaCardToSecondlist(card);
	}

	@When("User moves card from one list to another")
	public void user_moves_card_from_one_list_to_another() {
		oBoardPage.Movrcards();
	}

	@Then("I should see card is moved to the new list")
	public void i_should_see_card_is_moved_to_the_new_list() {
		oBoardPage.verifyMovedCards();
	}

	@When("User edit the Task")
	public void user_edit_the_task() {
		oBoardPage.Edittask();
	}

	@Then("I should see updated task")
	public void i_should_see_updated_task() {
		oBoardPage.verifyupdatedCards();
	}

}
