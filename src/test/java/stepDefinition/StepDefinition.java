package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {

    @Given("^user is on landing page$")
    public void user_is_on_landing_page(){
        System.out.println("user is on landing page");
    }

    @Given("^user is on  network landing page$")
    public void user_is_on_Net_landing_page(){
        System.out.println("user is on  network landing page");
    }

   // @When("^user login with username {string} and password {string}$")
    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String name, String password) {
        System.out.println("user login with username and password");
        System.out.println(name);
        System.out.println(password);
    }

    @Then("^Home page is populated$")
    public void homePageIsPopulated() {
        System.out.println("Home page is populated");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("Cards are displayed");
    }

    @And("Cards are not displayed")
    public void cardsAreNotDisplayed() {

        System.out.println("Cards are not displayed");
    }

}
