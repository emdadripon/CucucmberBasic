Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login wiht correct username and password
    Given I navigate to the login page
    And I  enter the the following for login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    And I should see the userform page

  Scenario Outline: Login with correct username and password using Scenario outline
    Given I navigate to the login page
    And I  enter the <username> and <password>
    And I click login button
    And I should see the userform page

    Examples:
      | username | password   |
      | execute  | automation |
      | admin    | admin      |
      | testing  | qa         |