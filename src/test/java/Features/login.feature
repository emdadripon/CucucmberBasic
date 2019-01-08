Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login wiht correct username and password
    Given I navigate to the login page
    And I  enter the the following for login
      | username            | password    |
      | eriponctg@gmail.com | ctg10251979 |
    And I click login button
    And I should see the userform page

  Scenario: Login wiht correct username and password to fail
    Given I navigate to the login page
    And I  enter the the following for login
      | username            | password    |
      | eriponctg@gmail.com | ctg10251979 |
    And I click login button
    And I should see the userform page wrongly
