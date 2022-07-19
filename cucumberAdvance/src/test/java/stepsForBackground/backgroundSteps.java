package stepsForBackground;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class backgroundSteps {
	WebDriver driver;
	public void setup()
	{
		
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside:User is on login page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside:User enters username and password ");
	}

	@And("Click on login page")
	public void click_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside:Click on login page ");
	}

	@Then("User is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside:User is navigated to the homepage ");
	}

	@When("User clicks on welcome link")
	public void user_clicks_on_welcome_link() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside:User clicks on welcome link");
	}

	@Then("Logout link is displayed")
	public void logout_link_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside:Logout link is displayed");
	}

	@When("User clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Inside: User clicks on dashboard link");
	}

	@Then("Quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside:Quick launch toolbar is displayed");
	}

}
