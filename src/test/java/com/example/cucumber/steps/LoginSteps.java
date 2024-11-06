package com.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private String username;
    private String password;
    private String message;


    @Given("Username is {string} and password is {string}")
    public void username_and_password(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        //First Scenario - Successful Login
        if ("admin".equals(username) && "admin".equals(password)) {
            this.message = "Welcome!";
        }

        //Second Scenario - Unsuccessful Login with wrong password
        else if ("admin".equals(username) && "wrong".equals(password)) {
            this.message = "Wrong Password!";
        }

        //Third Scenario - Unsuccessful Login with wrong username
        else if ("wrong".equals(username) && "admin".equals(password)) {
            this.message = "Wrong Username!";
        }

        //Both wrong.
        else {
            this.message = "Invalid Credentials!";
        }
    }

    @Then("User should see the message {string}")
    public void user_should_see_message(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }


}
