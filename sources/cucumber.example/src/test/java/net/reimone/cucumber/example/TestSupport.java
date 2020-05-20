package net.reimone.cucumber.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.reimone.cucumber.example.pages.GooglePage;

public class TestSupport {

	private GooglePage googlePage = new GooglePage();
	
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
		googlePage.launchBrowser();
	}

	@When("I open Google Homepage")
	public void i_open_Google_Homepage() {
		googlePage.openGoogleURL();
	}
	
	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() {
		googlePage.checkSearchBoxIsDisplayed();
	}
	
	@Then("the page displays Google Search button")
	public void the_page_displays_Google_Search_button() {
		googlePage.checkGoogleSearchButtonIsDisplayed();
	}
	
	@Then("the page displays Im Feeling Lucky button")
	public void the_page_displays_Im_Feeling_Lucky_button() {
		googlePage.checkImFeelingLuckyButtonIsDisplayed();
	}
}
