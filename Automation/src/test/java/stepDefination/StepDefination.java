package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	
	 @Given("^User is on Landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	  
	    }

	    @When("^User login into the application with username and password$")
	    public void user_login_into_the_application_with_username_and_password() throws Throwable {
	    	System.out.println("User login into the application with username and password");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("Home page is populated");
	  
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("cards are displayed");
	   
	    }

	}