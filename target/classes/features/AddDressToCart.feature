
Feature:

  @AddToCart @regression
  Scenario Outline:
    Given I navigate to login page
    When I enter the username as "<Username>" and password as "<Password>"
    And I am searching for a particular dress
    And I select the most expensive dress
    Then I can see a text displayed one item added to the cart
    Then I land on the shopping cart page
    And I finally sign out
    When I now login with correct username as "<Username>" and password as "<Password>"
    And I select Cart button
    Then I should  see the item in the cart

    Examples:
      | Username               | Password |
      | kunle35awesu@gmail.com | 12345    |