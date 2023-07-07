@ui
Feature: Verify Depositing Functionality

  Scenario: Verify user can create deposit money to the account
    Given user open the website
    When user enter "login.username" as username and "login.password" as password
    Then verify user is navigated to home page
    When user click on deposit tab
    Then verify deposit page is displayed
    When user select "d.account.name" deposit account from the dropdown
    And enter the deposit "d.amount" as amount
    And click on deposit submit button
    Then after deposit verify "d.account.name" on checking-savings account page is displayed
    And verify deposit entry "d.amount" at "d.account.name" is displayed in the transaction history