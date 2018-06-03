
Feature: Login test
  This feature deals with the login functionality of the application

  @login @regression
  Scenario: Login with correct username and password
    Given I navigate to login page
    When I enter the username as "kunle35awesu@gmail.com" and password as "12345"
    Then I can see My Account created
    And I finally sign out

