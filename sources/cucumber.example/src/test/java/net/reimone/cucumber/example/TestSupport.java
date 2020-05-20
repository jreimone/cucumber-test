package net.reimone.cucumber.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSupport {

	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
		System.out.println("TestSupport.i_launch_Chrome_browser()");
	}

	@When("I open Google Homepage")
	public void i_open_Google_Homepage() {
		System.out.println("TestSupport.i_open_Google_Homepage()");
	}
	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() {
		System.out.println("TestSupport.i_verify_that_the_page_displays_search_text_box()");
	}
	@Then("the page displays Google Search button")
	public void the_page_displays_Google_Search_button() {
		System.out.println("TestSupport.the_page_displays_Google_Search_button()");
	}
	
	@Then("the page displays Im Feeling Lucky button")
	public void the_page_displays_Im_Feeling_Lucky_button() {
		System.out.println("TestSupport.the_page_displays_Im_Feeling_Lucky_button()");
	}
}
