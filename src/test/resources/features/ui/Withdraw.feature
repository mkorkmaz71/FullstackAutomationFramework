@ui
Feature: Verify Withdrawing Functionality

  Scenario: Verify user can create withdraw money from the account
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on withdraw tab
    Then verify withdraw page is displayed
    When user select "w.account.name" withdraw account from the dropdown
    And enter the withdraw "w.amount" as amount
    And click on withdraw submit button
    Then after withdraw verify "w.account.name" on checking-savings account page is displayed
    And verify withdraw entry "w.amount" at "w.account.name" is displayed in the transaction history