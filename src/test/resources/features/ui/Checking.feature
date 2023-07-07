@ui
Feature: Verify Checking Account Functionality

  Scenario: Verify user can create new checking account
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on checking tab
    And click on new checking button
    Then verify new checking account page is displayed
    When user enters "c.type","c.ownership","c.name","c.openingBalance" as new checking account details
    And click on new checking submit button
    Then verify view checking account page is displayed
    And verify checking account creation success message is displayed