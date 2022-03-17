package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userStepDef {

    @Given("user is on login page")
    public void user_is_on_login_page() {
       System.out.println("user is on login page");
    }

    @When("user enters username")
    public void user_enters_username() {
        System.out.println("Step Inside : user insert required username");
    }

    @And("user enters password")
    public void user_enters_password() {
        System.out.println("Step Inside : user insert required password");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Step Inside : user click the login button");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Step Inside : user is on home page right now");
    }
}
