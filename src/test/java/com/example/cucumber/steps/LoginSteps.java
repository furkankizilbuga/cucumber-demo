package com.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private String username;
    private String password;
    private String message;


    //First Scenario
    @Given("Username is {string} and password is {string} for successful login")
    public void username_and_password_for_successful_login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @When("User enters username and password correctly")
    public void user_enters_both_correctly() {
        if("admin".equals(username) && "admin".equals(password)) {
            this.message = "Welcome!";
        }
    }

    @Then("User should see 'Welcome!' message")
    public void user_should_see_welcome_message() {
        assertEquals("Welcome!", message);
    }


    //Second Scenario
    @Given("Username is {string} and password is {string} for unsuccessful login")
    public void username_and_password_for_unsuccessful_login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @When("User enters username correctly and password incorrectly")
    public void user_enters_username_correctly_and_password_incorrectly() {
        if("admin".equals(username) && "wrong".equals(password)) {
            this.message = "Wrong Password!";
        }
    }

    @Then("User should see 'Wrong Password!' message")
    public void user_should_see_wrong_password_message() {
        assertEquals("Wrong Password!", message);
    }

}
