Feature: Create new account
  This feature deals

  @createAccount
  Scenario Outline: Create new account
    Given I navigate to login page
    When I create new account with the following details "<Email>" "<First_Name>" "<Last_Name>" "<Password>" "<Address>" "<City>" "<State>" "<Code>" "<Country>" "<Mobile>" "<Reference>"
    Then I can see My Account created
    And I finally sign out
    Examples:
      | Email            | First_Name | Last_Name  | Password | Address       | City        | State | Code  | Country       | Mobile | Reference |
      | abc002@gmail.com | Test       | Automation | 12345    | 702 SW 8th St | Bentonville | Ohio  | 72716 | United States | 078905 | Stars     |
      | abc003@gmail.com | Test       | Automation | 17890    | 702 SW 8th St | Bentonville | Ohio  | 72716 | United States | 087659 | mobile    |
      | abc004@gmail.com | Test       | Automation | 12347    | 702 SW 8th St | Bentonville | Ohio  | 72716 | United States | 097430 | estimate  |