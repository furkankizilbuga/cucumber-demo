package com.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private String username;
    private String password;
    private String message;

    @Given("Username and password are 'admin'")
    public void username_and_password_admin() {
        this.username = "admin";
        this.password = "admin";
    }

    @When("User enters username and password correctly")
    public void user_enters_both_correctly() {
        if("admin".equals(username) && "admin".equals(password)) {
            this.message = "Welcome!";
        }
    }

    @Then("User should see \"Welcome!\" message")
    public void user_should_see_welcome_message() {
        assertEquals("Welcome!", message);
    }

}
