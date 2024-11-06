package com.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.cucumber.LoginService;

import static org.junit.Assert.assertEquals;

public class LoginSteps {


    private final LoginService loginService;

    public LoginSteps() {
        this.loginService = new LoginService();  //BAD - Will use Spring dependency injection next time.
    }



    @Given("Username is {string} and password is {string}")
    public void username_and_password(String username, String password) {
        loginService.setUsername(username);
        loginService.setPassword(password);
    }



    //First Scenario
    @When("User logs in with correct username and password")
    public void user_logs_in_with_correct_credentials() {
        if ("admin".equals(loginService.getUsername()) && "admin".equals(loginService.getPassword())) {
            loginService.setMessage("Welcome!");
        }
    }

    //Second Scenario
    @When("User logs in with correct username and incorrect password")
    public void user_logs_in_with_incorrect_password() {
        if ("admin".equals(loginService.getUsername()) && !"admin".equals(loginService.getPassword())) {
            loginService.setMessage("Wrong Password!");
        }
    }

    //Third Scenario
    @When("User logs in with incorrect username and correct password")
    public void user_logs_in_with_incorrect_username() {
        if (!"admin".equals(loginService.getUsername()) && "admin".equals(loginService.getPassword())) {
            loginService.setMessage("Wrong Username!");
        }
    }



    @Then("User should see the message {string}")
    public void user_should_see_message(String expectedMessage) {
        assertEquals(expectedMessage, loginService.getMessage());
    }


}
