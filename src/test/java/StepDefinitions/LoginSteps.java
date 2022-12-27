package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I open url")
    public void i_open_url() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am inside Given step");
    }
    @When("I enter login details")
    public void i_enter_login_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am inside When step");
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am inside Then step");
    }

}
