Feature: User Login

  Scenario: Successful Login
    Given Username and password are 'admin'
    When User enters username and password correctly
    Then User should see "Welcome!" message