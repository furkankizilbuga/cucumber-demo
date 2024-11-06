Feature: User Login

  Scenario: Successful Login
    Given Username is 'admin' and password is 'admin' for successful login
    When User enters username and password correctly
    Then User should see 'Welcome!' message

  Scenario: Unsuccessful Login with wrong password
    Given Username is 'admin' and password is 'wrong' for unsuccessful login
    When User enters username correctly and password incorrectly
    Then User should see 'Wrong Password!' message
    