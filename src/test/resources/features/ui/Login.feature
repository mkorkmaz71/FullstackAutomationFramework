@ui
Feature: Verify Login Functionality

  Scenario:  Verify user can log into the application
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page

  Scenario Outline:  Verify user can not log into the application with invalid credentials
    Given user open the website
    When user enter invalid "<username>" as username and invalid "<password>" as password
    Then verify user is not navigated to home page and error message is displayed
    Examples:
      | username           | password   |
      |                    |            |
      | admin@admin.com    | admin1234  |
      | mkorkmaz@yahoo.com | admin1234  |
      | admin@admin.com    | Mk4415547/ |