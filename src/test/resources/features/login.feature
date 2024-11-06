Feature: User Login

  Scenario: Successful Login
    Given Username is 'admin' and password is 'admin'
    When User logs in with correct username and password
    Then User should see the message 'Welcome!'

  Scenario: Unsuccessful Login with wrong password
    Given Username is 'admin' and password is 'wrong'
    When User logs in with correct username and incorrect password
    Then User should see the message 'Wrong Password!'

  Scenario: Unsuccessful Login with wrong username
    Given Username is 'wrong' and password is 'admin'
    When User logs in with incorrect username and correct password
    Then User should see the message 'Wrong Username!'