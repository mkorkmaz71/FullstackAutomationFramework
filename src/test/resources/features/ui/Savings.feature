@ui
Feature: Verify Savings Account Functionality

  Scenario: Verify user can create new savings account
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on savings tab
    And click on New Savings button
    Then verify new savings account page is displayed
    When user enters "s.type","s.ownership","s.name","s.openingBalance" as new savings account details
    And click on  new savings submit button
    Then verify view savings account page is displayed
    And verify savings account creation success message is displayed