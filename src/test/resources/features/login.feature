Feature: User Login

  Scenario: Successful Login
    Given Username is 'admin' and password is 'admin'
    When User enters username and password
    Then User should see the message 'Welcome!'

  Scenario: Unsuccessful Login with wrong password
    Given Username is 'admin' and password is 'wrong'
    When User enters username and password
    Then User should see the message 'Wrong Password!'

  Scenario: Unsuccessful Login with wrong username
    Given Username is 'wrong' and password is 'admin'
    When User enters username and password
    Then User should see the message 'Wrong Username!'